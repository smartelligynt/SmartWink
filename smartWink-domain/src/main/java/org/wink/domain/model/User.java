package org.wink.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User {

	@Column
	private String loginId;
	
	@Column
	private String provider;
	
	@Column
	private String docJson;

	@Column
	private boolean isTemp;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDocJson() {
		return docJson;
	}

	public void setDocJson(String docJson) {
		this.docJson = docJson;
	}
}
