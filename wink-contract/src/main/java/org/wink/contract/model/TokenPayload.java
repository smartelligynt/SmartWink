package org.wink.contract.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "payload", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.FIELD)
public class TokenPayload {
	
	@XmlElement(name = "data")
	private TokenData data;

	public TokenData getData() {
		return data;
	}

	public void setData(TokenData data) {
		this.data = data;
	}
}
