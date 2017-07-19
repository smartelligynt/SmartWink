package org.sw.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.sw.api.LandingService;
import org.wink.api.OAuthService;
import org.wink.contract.model.Credentials;
import org.wink.contract.model.TokenPayload;

import com.smartelligynt.client.api.EventReciever;
import com.smartelligynt.client.api.model.Authentication;
import com.smartelligynt.client.api.model.Token;
import com.smartelligynt.client.api.model.User;

import io.swagger.annotations.Api;

@Api
@Component("landingService")
public class LandingServiceImpl implements LandingService {

	@Value("${clientid}")
	String client_id;

	@Value("${clientSecret}")
	String client_secret;


	@Autowired
	@Qualifier("oAuthService")
	OAuthService oAuthService;

	@Autowired
	@Qualifier("smartEventService")
	EventReciever eventReciever;

	public static final String WINK = "WINK";

	@Override
	public String pair(String state, String code) {
		try {
			String[] stateParams = state.split(";");
			String userId = stateParams[0];
			String appName = stateParams[1];
			String authToken = stateParams[2];
			User user = eventReciever.getUsers(userId);
			Calendar currentDate = Calendar.getInstance();
			Iterator<Authentication> authIterator = user.getToken().get(UserServiceImpl.SMARTELLIGENT).iterator();
			while (authIterator.hasNext()) {
				Authentication authentication = authIterator.next();
				if (authentication.getAppName().equals(appName)
						&& authentication.getShortLivedToken().getValue().equals(authToken)
						&& authentication.getShortLivedToken().getExpiresOn().after(currentDate.getTime())) {
					Credentials credentials = new Credentials();
					credentials.setClientSecret(client_secret);
					credentials.setCode(code);
					credentials.setGrantType("authorization_code");
					TokenPayload payload = oAuthService.getToken(credentials);

					Map<String, List<Authentication>> tokens = user.getToken();
					if (null == tokens.get(WINK)) {
						tokens.put(WINK, new ArrayList<Authentication>());
					}
					List<Authentication> authentications = tokens.get(WINK);
					Authentication winkAuth = new Authentication();
					authentications.add(winkAuth);
					tokens.put(WINK, authentications);
					winkAuth.setAppName(appName);
					winkAuth.setCreatedTime(Calendar.getInstance().getTime());
					winkAuth.setShortLivedToken(new Token());
					winkAuth.getShortLivedToken().setValue(payload.getData().getAccessToken());
					currentDate.add(Calendar.MINUTE, 60);
					authentication.getShortLivedToken().setExpiresOn(currentDate.getTime());
					winkAuth.setRefreshToken(new Token());
					winkAuth.getRefreshToken().setValue(payload.getData().getRefreshToken());
					currentDate.add(Calendar.YEAR, 1);
					winkAuth.getRefreshToken().setExpiresOn(currentDate.getTime());
					authIterator.remove();
				} else if (authentication.getShortLivedToken().getExpiresOn().after(currentDate.getTime())) {
					authIterator.remove();
				}
			}
			eventReciever.users(userId, user);

		} catch (WebApplicationException ex) {
			Response r = ex.getResponse();
			String message = ex.getMessage();
			System.err.println("#######################WAException ocurred:"+message);
		} catch (Throwable t) {
			System.err.println("#######################Exception/Error ocurred:"+ExceptionUtils.getCause(t));
		}
		return "SUCCESS";
	}

	@Override
	public String refreshAccess(String refreshToken) {
		try {
			Credentials credentials = new Credentials();
			credentials.setClientSecret(client_secret);
			if (StringUtils.isNotEmpty(refreshToken)) {
				credentials.setClientId(client_id);
				credentials.setRefreshToken(refreshToken);
				credentials.setGrantType("refresh_token");
			}
			TokenPayload payload = oAuthService.getToken(credentials);
			return payload.getData().getAccessToken();
		} catch (WebApplicationException ex) {
			Response r = ex.getResponse();
			String message = ex.getMessage();
		}
		return null;
	}

	@Override
	public String getAccess(String userName, String password) {
		try {
			Credentials credentials = new Credentials();
			credentials.setClientSecret(client_secret);
			if (StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(password)) {
				credentials.setUserName(userName);
				credentials.setPassword(password);
				credentials.setGrantType("password");
			}
			TokenPayload payload = oAuthService.getToken(credentials);

			return payload.getData().getAccessToken();
		} catch (WebApplicationException ex) {
			Response r = ex.getResponse();
			String message = ex.getMessage();
		}
		return null;
	}
	
	@Override
	public String refreshAccessToken(String userId) {
		Calendar now = Calendar.getInstance();
		User user = eventReciever.getUsers(userId);
		String accessToken = null;
		for(Authentication auth : user.getToken().get(WINK)) {
			if(now.getTime().before(auth.getRefreshToken().getExpiresOn())){
				String refreshToken = auth.getRefreshToken().getValue();
				Credentials credentials = new Credentials();
				credentials.setClientSecret(client_secret);
				if (StringUtils.isNotEmpty(refreshToken)) {
					credentials.setClientId(client_id);
					credentials.setRefreshToken(refreshToken);
					credentials.setGrantType("refresh_token");
				}
				TokenPayload payload = oAuthService.getToken(credentials);
				Token shortLivedToken = new Token();
				auth.setShortLivedToken(shortLivedToken);
				accessToken = payload.getData().getAccessToken();
				shortLivedToken.setValue(accessToken);
				Calendar slExp = Calendar.getInstance();
				slExp.add(Calendar.HOUR, 1);
				shortLivedToken.setExpiresOn(slExp.getTime());
			}
		}
		eventReciever.users(userId, user);
		return "SUCCESS";
	}
}
