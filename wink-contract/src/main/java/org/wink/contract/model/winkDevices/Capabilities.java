package org.wink.contract.model.winkDevices;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {
	private boolean home_security_device;
	private Boolean is_generic;
	private Boolean mass_broadcast_disabled;
	private boolean needs_wifi_network_list;
	private ArrayList<String> oauth2_clients;
	private String provisioning_version;
	private boolean supports_ble;

	public boolean isHome_security_device() {
		return home_security_device;
	}

	public void setHome_security_device(boolean home_security_device) {
		this.home_security_device = home_security_device;
	}

	public Boolean getIs_generic() {
		return is_generic;
	}

	public void setIs_generic(Boolean is_generic) {
		this.is_generic = is_generic;
	}

	public Boolean getMass_broadcast_disabled() {
		return mass_broadcast_disabled;
	}

	public void setMass_broadcast_disabled(Boolean mass_broadcast_disabled) {
		this.mass_broadcast_disabled = mass_broadcast_disabled;
	}

	public boolean isNeeds_wifi_network_list() {
		return needs_wifi_network_list;
	}

	public void setNeeds_wifi_network_list(boolean needs_wifi_network_list) {
		this.needs_wifi_network_list = needs_wifi_network_list;
	}

	public ArrayList<String> getOauth2_clients() {
		return oauth2_clients;
	}

	public void setOauth2_clients(ArrayList<String> oauth2_clients) {
		this.oauth2_clients = oauth2_clients;
	}

	public String getProvisioning_version() {
		return provisioning_version;
	}

	public void setProvisioning_version(String provisioning_version) {
		this.provisioning_version = provisioning_version;
	}

	public boolean isSupports_ble() {
		return supports_ble;
	}

	public void setSupports_ble(boolean supports_ble) {
		this.supports_ble = supports_ble;
	}
}