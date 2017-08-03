package org.sw.service.impl;

import static org.sw.service.impl.LandingServiceImpl.WINK;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.sw.api.LandingService;
import org.sw.api.ListenService;
import org.sw.api.UserService;
import org.sw.api.model.PubNubTopic;
import org.sw.service.util.PNManager;
import org.wink.api.UserDetailsService;
import org.wink.contract.model.winkDevices.Datum;
import org.wink.contract.model.winkDevices.WinkDevices;
import org.wink.contract.model.winkUser.WinkUser;

import com.smartelligynt.client.api.EventReciever;
import com.smartelligynt.client.api.model.Authentication;
import com.smartelligynt.client.api.model.User;

import io.swagger.annotations.Api;

@Api
@Component("listenService")
public class ListenServiceImpl implements ListenService {

	@Value("${clientid}")
	String client_id;

	@Value("${clientSecret}")
	String client_secret;

	@Autowired
	PNManager pnManager;

	@Autowired
	@Qualifier("userService")
	UserService userService;

	@Autowired
	@Qualifier("userDetailService")
	UserDetailsService userDetailService;

	@Autowired
	@Qualifier("listenService")
	ListenService listenService;

	@Autowired
	@Qualifier("landingService")
	LandingService landingService;

	@Autowired
	@Qualifier("smartEventService")
	EventReciever eventReciever;

	private static final Logger LOGGER = LoggerFactory.getLogger(ListenServiceImpl.class);

	@Override
	public void listen(PubNubTopic topic) {
		pnManager.add(topic, null);
	}

	@Override
	public void startListen(String userId) {
		landingService.refreshAccessToken(userId);
		User user = eventReciever.getUsers(userId);
		Calendar today = Calendar.getInstance();
		Map<String, PubNubTopic> subKeyVSdeviceTopics = new HashMap<>();
		for (Authentication authentication : user.getToken().get(WINK)) {
			// Object subscriptions
			WinkDevices winkDevices = userDetailService.getWinkDevices("Bearer "+authentication.getShortLivedToken().getValue(),
					client_id, client_secret);
			for (Datum datum : winkDevices.getData()) {
				if (null == subKeyVSdeviceTopics.get(datum.getSubscription().getPubnub().getSubscribe_key())) {
					PubNubTopic topic = new PubNubTopic();
					topic.setTopicType("OBJECT");
					topic.setTopics(new ArrayList<String>());
					topic.setSubscriberKey(datum.getSubscription().getPubnub().getSubscribe_key());
					subKeyVSdeviceTopics.put(datum.getSubscription().getPubnub().getSubscribe_key(), topic);
				}
				PubNubTopic pnTopic = subKeyVSdeviceTopics.get(datum.getSubscription().getPubnub().getSubscribe_key());
				pnTopic.getTopics().add(datum.getSubscription().getPubnub().getChannel());
			}
			for(PubNubTopic pubNubTopic : subKeyVSdeviceTopics.values()) {
				pnManager.add(pubNubTopic, userId);
			}
			// List subscriptions
			WinkUser winkUser = userDetailService.getUser("Bearer "+authentication.getShortLivedToken().getValue(),
					client_id, client_secret);
			PubNubTopic userTopic = new PubNubTopic();
			userTopic.setTopicType("LIST");
			userTopic.setSubscriberKey(winkUser.getData().getSubscription().getPubnub().getSubscribe_key());
			userTopic.setTopics(new ArrayList<String>());
			userTopic.getTopics().add(winkUser.getData().getSubscription().getPubnub().getChannel());
			pnManager.add(userTopic, userId);
		}
	}
	
	@Override
	public void startListen(String userId, String winkId) {}

	@Override
	public void stopListen(String userId) {
		// TODO Auto-generated method stub

	}
}
