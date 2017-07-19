package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pubnub {
	private String channel;
	private String subscribe_key;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSubscribe_key() {
		return subscribe_key;
	}

	public void setSubscribe_key(String subscribe_key) {
		this.subscribe_key = subscribe_key;
	}
}