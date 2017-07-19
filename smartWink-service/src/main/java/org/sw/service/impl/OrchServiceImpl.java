package org.sw.service.impl;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.sw.api.LandingService;
import org.sw.api.ListenService;
import org.sw.api.OrchService;
import org.sw.api.model.PubNubTopic;
import org.wink.api.UserDetailsService;
import org.wink.contract.model.Pubnub;
import org.wink.contract.model.winkDevices.WinkDevices;
import org.wink.contract.model.winkUser.WinkUser;

import io.swagger.annotations.Api;


@Api
@Component("orchestrationService")
public class OrchServiceImpl implements OrchService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrchServiceImpl.class);
	
	@Autowired
	LandingService landingService;
	
	@Value("${clientid}")
	String client_id;

	@Value("${clientSecret}")
	String client_secret;

	@Autowired
	@Qualifier("userDetailService")
	UserDetailsService userDetailService;
	
	@Autowired
	@Qualifier("listenService")
	ListenService listenService;


	@Override
	public void orchestrate(String refreshToken) {
		String accessToken = landingService.refreshAccess(refreshToken);
		WinkUser winkUser =  userDetailService.getUser("Bearer "+accessToken, client_id, client_secret);
		WinkDevices winkDevices = userDetailService.getWinkDevices("Bearer "+accessToken, client_id, client_secret);
		Pubnub subscription = winkUser.getData().getSubscription().getPubnub();
		PubNubTopic pnTopic = new PubNubTopic();
		pnTopic.setSubscriberKey(subscription.getSubscribe_key());
		pnTopic.setTopics(Arrays.asList(subscription.getChannel()));
		pnTopic.setTopicType("LIST");
	}
}
