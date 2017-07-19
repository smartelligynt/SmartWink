package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Subscription {
	private Pubnub pubnub;

	public Pubnub getPubnub() {
		return pubnub;
	}

	public void setPubnub(Pubnub pubnub) {
		this.pubnub = pubnub;
	}
}