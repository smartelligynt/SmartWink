package org.wink.contract.model.winkUser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.wink.contract.model.LastReading;
import org.wink.contract.model.Subscription;

@XmlRootElement(name = "userdata", namespace = "org.wink.service.model")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserData {
	@XmlElement(name = "first_name")
	private String first_name;

	@XmlElement(name = "confirmed")
	private String confirmed;

	@XmlElement(name = "subscription")
	private Subscription subscription;

	@XmlElement(name = "email")
	private String email;

	private LastReading last_reading;

	private String locale;

	private String last_name;

	private String created_at;

	private String user_id;

	private String uuid;

	private String tos_accepted;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LastReading getLast_reading() {
		return last_reading;
	}

	public void setLast_reading(LastReading last_reading) {
		this.last_reading = last_reading;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTos_accepted() {
		return tos_accepted;
	}

	public void setTos_accepted(String tos_accepted) {
		this.tos_accepted = tos_accepted;
	}
}
