package org.sw.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.smartelligynt.client.api.EventReciever;

public class DeviceCallBack extends SubscribeCallback{
	private static final Logger LOGGER = LoggerFactory.getLogger(DeviceCallBack.class);
	
	@Autowired
	@Qualifier("smartEventService")
	EventReciever eventReciever;
	
	@Override
	public void status(PubNub pubnub, PNStatus status) {
		LOGGER.info("status invoked");
		LOGGER.info(status.toString());
	}

	@Override
	public void message(PubNub pubnub, PNMessageResult message) {
		LOGGER.info("status invoked");
		LOGGER.info(message.toString());
	}

	@Override
	public void presence(PubNub pubnub, PNPresenceEventResult presence) {
		LOGGER.info("presence invoked");
		LOGGER.info(presence.toString());
	}

}
