package org.wink.contract.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credentials", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class Credentials {

	@XmlElement(name = "client_secret")
	private String clientSecret;

	@XmlElement(name = "grant_type")
	private String grantType;

	@XmlElement(name = "code")
	private String code;

	@XmlElement(name = "client_id")
	private String clientId;

	@XmlElement(name = "refresh_token")
	private String refreshToken;

	@XmlElement(name = "username")
	private String userName;

	@XmlElement(name = "password")
	private String password;

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
