package org.wink.contract.model.winkUser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.wink.contract.model.Pagination;

@XmlRootElement(name = "winkuser", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.FIELD)
public class WinkUser {

	@XmlElement(name = "errors")
	private String[] errors;

	@XmlElement(name = "data")
	private UserData data;

	private Pagination pagination;

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

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}
