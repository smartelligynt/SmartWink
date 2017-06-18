package org.sw.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "signInRequest", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class SignInRequest {
	
	@XmlElement(name = "username")
	private String username;

	@XmlElement(name = "password")
	private String password;

}
