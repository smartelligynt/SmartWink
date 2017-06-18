package org.wink.contract.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "winkuser", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.NONE)
public class WinkUser {

	@XmlElement(name = "errors")
	private String[] errors;

	@XmlElement(name = "data")
	private UserData data;

	private String pagination;

	public String[] getErrors() {
		return errors;
	}

	public void setErrors(String[] errors) {
		this.errors = errors;
	}

	public UserData getData() {
		return data;
	}

	public void setData(UserData data) {
		this.data = data;
	}

	public String getPagination() {
		return pagination;
	}

	public void setPagination(String pagination) {
		this.pagination = pagination;
	}
}
