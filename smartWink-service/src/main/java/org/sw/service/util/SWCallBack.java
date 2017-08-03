package org.sw.service.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.wink.contract.model.winkDevices.Datum;
import org.wink.contract.model.winkDevices.DesiredState;
import org.wink.contract.model.winkDevices.LastReading;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.smartelligynt.client.api.EventReciever;
import com.smartelligynt.client.api.model.Event;

public class SWCallBack extends SubscribeCallback{
	private static final Logger LOGGER = LoggerFactory.getLogger(SWCallBack.class);
	
	@Autowired
	@Qualifier("smartEventService")
	EventReciever eventReciever;
	
	@Autowired
	ObjectMapper objectMapper;
	
	private String userId;
	
	@Override
	public void status(PubNub pubnub, PNStatus status) {
		LOGGER.info("status invoked");
		LOGGER.info(status.toString());
	}

	@Override
	public void message(PubNub pubnub, PNMessageResult pnMessageResult) {
		LOGGER.info("message invoked");
		LOGGER.info(pnMessageResult.toString());
		try {
			Datum datum = objectMapper.readValue(pnMessageResult.getMessage().getAsString(), Datum.class);
			String deviceId = datum.getUuid();
			LastReading lastReading = datum.getLast_reading();
			Event lastReadingEvent = new Event();
			lastReadingEvent.setEt(String.valueOf(Calendar.getInstance().getTimeInMillis()));
			if(null != datum.getLast_reading().getPowered()) {
				lastReadingEvent.setEn("lastReading_"+datum.getUpc_code());
				lastReadingEvent.setEv(String.valueOf(datum.getLast_reading().getPowered()));
				eventReciever.events(userId, deviceId, lastReadingEvent);
			}
//			Event desiredStateEvent = new Event();
//			desiredStateEvent.setEt(String.valueOf(Calendar.getInstance().getTimeInMillis()));
//			desiredStateEvent.setEn("desiredState_"+datum.getUpc_code());
			if(null !=datum.getLast_reading().getDesired_powered()) {
				lastReadingEvent.setEn("desiredState_"+datum.getUpc_code());
				lastReadingEvent.setEv(String.valueOf(datum.getLast_reading().getDesired_powered()));
				eventReciever.events(userId, deviceId, lastReadingEvent);
			}
			
			
		} catch (IOException e) {
			LOGGER.error("Error ocurred while parsing device message: %s", pnMessageResult.getMessage());
		}
	}

	@Override
	public void presence(PubNub pubnub, PNPresenceEventResult presence) {
		LOGGER.info("presence invoked");
		LOGGER.info(presence.toString());
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
