package org.sw.service.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sw.api.model.PubNubTopic;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;

@Component("PNManager")
public class PNManager {
	
	@Autowired
	ObjectFactory<DeviceCallBack> deviceCallbackFactory;

	@Autowired
	ObjectFactory<ListCallBack> listCallbackFactory;

	private Map<String, PubNub> pnMap = new ConcurrentHashMap<String, PubNub>();

	public void add(PubNubTopic pubNubTopic, String userId) {
		if (null == pnMap.get(pubNubTopic.getSubscriberKey())) {
			PNConfiguration pnConfiguration = new PNConfiguration().setSubscribeKey(pubNubTopic.getSubscriberKey());
			PubNub pubnub = new PubNub(pnConfiguration);
			SubscribeCallback cb = null;
			if (pubNubTopic.getTopicType().equals("LIST")) {
				ListCallBack listCallback = listCallbackFactory.getObject();
				listCallback.setUserId(userId);
				cb = listCallback;
			} else {
				DeviceCallBack deviceCallback = deviceCallbackFactory.getObject();
				deviceCallback.setUserId(userId);
				cb = deviceCallback;
			}
			pubnub.addListener(cb);
			pubnub.subscribe().channels(pubNubTopic.getTopics()).execute();
			pnMap.put(pubNubTopic.getSubscriberKey(), pubnub);
		} else {
			PubNub pubnub = pnMap.get(pubNubTopic.getSubscriberKey());
			List<String> channels = pubnub.getSubscribedChannels();
			channels.addAll(pubNubTopic.getTopics());
			pubnub.subscribe().channels(channels).execute();
		}
	}
	
	public void remove(PubNubTopic pubNubTopic) {
		PubNub pubnub = pnMap.get(pubNubTopic.getSubscriberKey());
		pubnub.unsubscribe().channels(pubNubTopic.getTopics());
	}
}
