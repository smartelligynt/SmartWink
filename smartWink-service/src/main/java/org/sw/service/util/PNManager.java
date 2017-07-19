package org.sw.service.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;
import org.sw.api.model.PubNubTopic;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;

@Component("PNManager")
public class PNManager {
	private Map<String, PubNub> pnMap = new ConcurrentHashMap<String, PubNub>();

	public void add(PubNubTopic pubNubTopic) {
		if (null == pnMap.get(pubNubTopic.getSubscriberKey())) {
			PNConfiguration pnConfiguration = new PNConfiguration().setSubscribeKey(pubNubTopic.getSubscriberKey());
			PubNub pubnub = new PubNub(pnConfiguration);
			SubscribeCallback cb = null;
			if (pubNubTopic.getTopicType().equals("LIST")) {
				cb = new ListCallBack();
			} else {
				cb = new DeviceCallBack();
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
}
