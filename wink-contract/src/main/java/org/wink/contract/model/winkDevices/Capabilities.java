package org.wink.contract.model.winkDevices;

import java.util.ArrayList;

public class Capabilities {
	private boolean home_security_device;
	private Boolean is_generic;
	private Boolean mass_broadcast_disabled;
	private boolean needs_wifi_network_list;
	private ArrayList<String> oauth2_clients;
	private String provisioning_version;
	private boolean supports_ble;
}