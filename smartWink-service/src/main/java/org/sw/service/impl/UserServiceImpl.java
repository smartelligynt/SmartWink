package org.sw.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.sw.api.UserService;
import org.sw.api.model.User;

import com.smartelligynt.client.api.EventReciever;
import com.smartelligynt.client.api.model.Authentication;
import com.smartelligynt.client.api.model.Location;
import com.smartelligynt.client.api.model.Token;

import io.swagger.annotations.Api;

@Api
@Component("userService")
public class UserServiceImpl implements UserService {

	public static final String SMARTELLIGENT = "SMARTELLIGENT";
	@Autowired
	@Qualifier("smartEventService")
	EventReciever eventReciever;
	
	@Override
	public String createUser(String emailId, String location, String name, String timeZone) throws IOException {
		com.smartelligynt.client.api.model.User user = new com.smartelligynt.client.api.model.User();
		user.setEmailId(emailId);
		user.setLocation(new Location());
		user.getLocation().setLatitude(UUID.randomUUID().toString());
		user.getLocation().setLongitude(UUID.randomUUID().toString());
		user.setName(name);
		user.setTimeZone(timeZone);
		String userId = null;
		userId = eventReciever.users(user).getId();
		
		return userId;
	}
	
	@Override
	public User getUser(String userid) {
		com.smartelligynt.client.api.model.User user = eventReciever.getUsers(userid);
		User user2 = new User();
		user2.setEmailId(user.getEmailId());
		user2.setName(user.getName());
		return user2;
	}
	
	@Override
	public String initpair(String userId, String appName) throws IOException {
		Calendar currentDate = Calendar.getInstance();
		com.smartelligynt.client.api.model.User user = eventReciever.getUsers(userId);
		if(null == user.getToken()) {
			user.setToken(new HashMap<String, List<Authentication>>());
		}
		Map<String, List<Authentication>> tokens = user.getToken();
		if(null == tokens.get(SMARTELLIGENT)) {
			tokens.put(SMARTELLIGENT, new ArrayList<Authentication>());
		}
		List<Authentication> authentications = tokens.get(SMARTELLIGENT);
		List<Authentication> filtered = authentications.stream()
				.filter(auth -> {return !(auth.getAppName().equals(appName));})
				.filter(auth -> {return currentDate.after(auth.getExpiryTime());})
				.collect(Collectors.toList());
		Authentication authentication = new Authentication();
		filtered.add(authentication);
		tokens.put(SMARTELLIGENT, filtered);
		authentication.setAppName(appName);
		authentication.setCreatedTime(Calendar.getInstance().getTime());
		authentication.setShortLivedToken(new Token());
		authentication.getShortLivedToken().setValue(UUID.randomUUID().toString());
		currentDate.add(Calendar.MINUTE, 60);
		authentication.getShortLivedToken().setExpiresOn(currentDate.getTime());
		eventReciever.users(userId, user);
		String stateCode = userId+";"+appName+";"+authentication.getShortLivedToken().getValue();
		return stateCode;
	}

}
