package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LastReading {
	private String agent_session_id;
	private double agent_session_id_updated_at;
	private String app_version;
	private double app_version_updated_at;
	private Double brightness;
	private Double brightness_changed_at;
	private Double brightness_updated_at;
	private String bundle_id;
	private double bundle_id_updated_at;
	private boolean connection;
	private Double connection_changed_at;
	private String connection_type;
	private double connection_type_updated_at;
	private double connection_updated_at;
	private Double desired_brightness_changed_at;
	private Double desired_brightness_updated_at;
	private double desired_kidde_radio_code_updated_at;
	private double desired_led_brightness_updated_at;
	private double desired_pairing_device_type_selector_updated_at;
	private double desired_pairing_mode_duration_updated_at;
	private double desired_pairing_mode_updated_at;
	private Double desired_powered_changed_at;
	private Double desired_powered_updated_at;
	private Boolean desired_powered;
	private String firmware_date_code;
	private Double firmware_date_code_updated_at;
	private String firmware_version;
	private double firmware_version_updated_at;
	private String hub_version;
	private double hub_version_updated_at;
	private String ip_address;
	private double ip_address_updated_at;
	private double kidde_radio_code_updated_at;
	private String local_control_id;
	private double local_control_id_updated_at;
	private String local_control_public_key_hash;
	private double local_control_public_key_hash_updated_at;
	private String mac_address;
	private double mac_address_updated_at;
	private int pairing_mode_duration;
	private double pairing_mode_duration_updated_at;
	private double pairing_mode_updated_at;
	private Boolean powered;
	private Double powered_changed_at;
	private Double powered_updated_at;
	private boolean update_needed;
	private double update_needed_updated_at;
	private boolean updating_firmware;
	private double updating_firmware_updated_at;
	private boolean wifi_credentials_present;
	private double wifi_credentials_present_updated_at;
	private String zigbee_mac_address;
	private double zigbee_mac_address_updated_at;
	
	public String getAgent_session_id() {
		return agent_session_id;
	}
	public void setAgent_session_id(String agent_session_id) {
		this.agent_session_id = agent_session_id;
	}
	public double getAgent_session_id_updated_at() {
		return agent_session_id_updated_at;
	}
	public void setAgent_session_id_updated_at(double agent_session_id_updated_at) {
		this.agent_session_id_updated_at = agent_session_id_updated_at;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public double getApp_version_updated_at() {
		return app_version_updated_at;
	}
	public void setApp_version_updated_at(double app_version_updated_at) {
		this.app_version_updated_at = app_version_updated_at;
	}
	public Double getBrightness() {
		return brightness;
	}
	public void setBrightness(Double brightness) {
		this.brightness = brightness;
	}
	public Double getBrightness_changed_at() {
		return brightness_changed_at;
	}
	public void setBrightness_changed_at(Double brightness_changed_at) {
		this.brightness_changed_at = brightness_changed_at;
	}
	public Double getBrightness_updated_at() {
		return brightness_updated_at;
	}
	public void setBrightness_updated_at(Double brightness_updated_at) {
		this.brightness_updated_at = brightness_updated_at;
	}
	public String getBundle_id() {
		return bundle_id;
	}
	public void setBundle_id(String bundle_id) {
		this.bundle_id = bundle_id;
	}
	public double getBundle_id_updated_at() {
		return bundle_id_updated_at;
	}
	public void setBundle_id_updated_at(double bundle_id_updated_at) {
		this.bundle_id_updated_at = bundle_id_updated_at;
	}
	public boolean isConnection() {
		return connection;
	}
	public void setConnection(boolean connection) {
		this.connection = connection;
	}
	public Double getConnection_changed_at() {
		return connection_changed_at;
	}
	public void setConnection_changed_at(Double connection_changed_at) {
		this.connection_changed_at = connection_changed_at;
	}
	public String getConnection_type() {
		return connection_type;
	}
	public void setConnection_type(String connection_type) {
		this.connection_type = connection_type;
	}
	public double getConnection_type_updated_at() {
		return connection_type_updated_at;
	}
	public void setConnection_type_updated_at(double connection_type_updated_at) {
		this.connection_type_updated_at = connection_type_updated_at;
	}
	public double getConnection_updated_at() {
		return connection_updated_at;
	}
	public void setConnection_updated_at(double connection_updated_at) {
		this.connection_updated_at = connection_updated_at;
	}
	public Double getDesired_brightness_changed_at() {
		return desired_brightness_changed_at;
	}
	public void setDesired_brightness_changed_at(Double desired_brightness_changed_at) {
		this.desired_brightness_changed_at = desired_brightness_changed_at;
	}
	public Double getDesired_brightness_updated_at() {
		return desired_brightness_updated_at;
	}
	public void setDesired_brightness_updated_at(Double desired_brightness_updated_at) {
		this.desired_brightness_updated_at = desired_brightness_updated_at;
	}
	public double getDesired_kidde_radio_code_updated_at() {
		return desired_kidde_radio_code_updated_at;
	}
	public void setDesired_kidde_radio_code_updated_at(double desired_kidde_radio_code_updated_at) {
		this.desired_kidde_radio_code_updated_at = desired_kidde_radio_code_updated_at;
	}
	public double getDesired_led_brightness_updated_at() {
		return desired_led_brightness_updated_at;
	}
	public void setDesired_led_brightness_updated_at(double desired_led_brightness_updated_at) {
		this.desired_led_brightness_updated_at = desired_led_brightness_updated_at;
	}
	public double getDesired_pairing_device_type_selector_updated_at() {
		return desired_pairing_device_type_selector_updated_at;
	}
	public void setDesired_pairing_device_type_selector_updated_at(double desired_pairing_device_type_selector_updated_at) {
		this.desired_pairing_device_type_selector_updated_at = desired_pairing_device_type_selector_updated_at;
	}
	public double getDesired_pairing_mode_duration_updated_at() {
		return desired_pairing_mode_duration_updated_at;
	}
	public void setDesired_pairing_mode_duration_updated_at(double desired_pairing_mode_duration_updated_at) {
		this.desired_pairing_mode_duration_updated_at = desired_pairing_mode_duration_updated_at;
	}
	public double getDesired_pairing_mode_updated_at() {
		return desired_pairing_mode_updated_at;
	}
	public void setDesired_pairing_mode_updated_at(double desired_pairing_mode_updated_at) {
		this.desired_pairing_mode_updated_at = desired_pairing_mode_updated_at;
	}
	public Double getDesired_powered_changed_at() {
		return desired_powered_changed_at;
	}
	public void setDesired_powered_changed_at(Double desired_powered_changed_at) {
		this.desired_powered_changed_at = desired_powered_changed_at;
	}
	public Double getDesired_powered_updated_at() {
		return desired_powered_updated_at;
	}
	public void setDesired_powered_updated_at(Double desired_powered_updated_at) {
		this.desired_powered_updated_at = desired_powered_updated_at;
	}
	public Boolean getDesired_powered() {
		return desired_powered;
	}
	public void setDesired_powered(Boolean desired_powered) {
		this.desired_powered = desired_powered;
	}
	public String getFirmware_date_code() {
		return firmware_date_code;
	}
	public void setFirmware_date_code(String firmware_date_code) {
		this.firmware_date_code = firmware_date_code;
	}
	public Double getFirmware_date_code_updated_at() {
		return firmware_date_code_updated_at;
	}
	public void setFirmware_date_code_updated_at(Double firmware_date_code_updated_at) {
		this.firmware_date_code_updated_at = firmware_date_code_updated_at;
	}
	public String getFirmware_version() {
		return firmware_version;
	}
	public void setFirmware_version(String firmware_version) {
		this.firmware_version = firmware_version;
	}
	public double getFirmware_version_updated_at() {
		return firmware_version_updated_at;
	}
	public void setFirmware_version_updated_at(double firmware_version_updated_at) {
		this.firmware_version_updated_at = firmware_version_updated_at;
	}
	public String getHub_version() {
		return hub_version;
	}
	public void setHub_version(String hub_version) {
		this.hub_version = hub_version;
	}
	public double getHub_version_updated_at() {
		return hub_version_updated_at;
	}
	public void setHub_version_updated_at(double hub_version_updated_at) {
		this.hub_version_updated_at = hub_version_updated_at;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public double getIp_address_updated_at() {
		return ip_address_updated_at;
	}
	public void setIp_address_updated_at(double ip_address_updated_at) {
		this.ip_address_updated_at = ip_address_updated_at;
	}
	public double getKidde_radio_code_updated_at() {
		return kidde_radio_code_updated_at;
	}
	public void setKidde_radio_code_updated_at(double kidde_radio_code_updated_at) {
		this.kidde_radio_code_updated_at = kidde_radio_code_updated_at;
	}
	public String getLocal_control_id() {
		return local_control_id;
	}
	public void setLocal_control_id(String local_control_id) {
		this.local_control_id = local_control_id;
	}
	public double getLocal_control_id_updated_at() {
		return local_control_id_updated_at;
	}
	public void setLocal_control_id_updated_at(double local_control_id_updated_at) {
		this.local_control_id_updated_at = local_control_id_updated_at;
	}
	public String getLocal_control_public_key_hash() {
		return local_control_public_key_hash;
	}
	public void setLocal_control_public_key_hash(String local_control_public_key_hash) {
		this.local_control_public_key_hash = local_control_public_key_hash;
	}
	public double getLocal_control_public_key_hash_updated_at() {
		return local_control_public_key_hash_updated_at;
	}
	public void setLocal_control_public_key_hash_updated_at(double local_control_public_key_hash_updated_at) {
		this.local_control_public_key_hash_updated_at = local_control_public_key_hash_updated_at;
	}
	public String getMac_address() {
		return mac_address;
	}
	public void setMac_address(String mac_address) {
		this.mac_address = mac_address;
	}
	public double getMac_address_updated_at() {
		return mac_address_updated_at;
	}
	public void setMac_address_updated_at(double mac_address_updated_at) {
		this.mac_address_updated_at = mac_address_updated_at;
	}
	public int getPairing_mode_duration() {
		return pairing_mode_duration;
	}
	public void setPairing_mode_duration(int pairing_mode_duration) {
		this.pairing_mode_duration = pairing_mode_duration;
	}
	public double getPairing_mode_duration_updated_at() {
		return pairing_mode_duration_updated_at;
	}
	public void setPairing_mode_duration_updated_at(double pairing_mode_duration_updated_at) {
		this.pairing_mode_duration_updated_at = pairing_mode_duration_updated_at;
	}
	public double getPairing_mode_updated_at() {
		return pairing_mode_updated_at;
	}
	public void setPairing_mode_updated_at(double pairing_mode_updated_at) {
		this.pairing_mode_updated_at = pairing_mode_updated_at;
	}
	public Boolean getPowered() {
		return powered;
	}
	public void setPowered(Boolean powered) {
		this.powered = powered;
	}
	public Double getPowered_changed_at() {
		return powered_changed_at;
	}
	public void setPowered_changed_at(Double powered_changed_at) {
		this.powered_changed_at = powered_changed_at;
	}
	public Double getPowered_updated_at() {
		return powered_updated_at;
	}
	public void setPowered_updated_at(Double powered_updated_at) {
		this.powered_updated_at = powered_updated_at;
	}
	public boolean isUpdate_needed() {
		return update_needed;
	}
	public void setUpdate_needed(boolean update_needed) {
		this.update_needed = update_needed;
	}
	public double getUpdate_needed_updated_at() {
		return update_needed_updated_at;
	}
	public void setUpdate_needed_updated_at(double update_needed_updated_at) {
		this.update_needed_updated_at = update_needed_updated_at;
	}
	public boolean isUpdating_firmware() {
		return updating_firmware;
	}
	public void setUpdating_firmware(boolean updating_firmware) {
		this.updating_firmware = updating_firmware;
	}
	public double getUpdating_firmware_updated_at() {
		return updating_firmware_updated_at;
	}
	public void setUpdating_firmware_updated_at(double updating_firmware_updated_at) {
		this.updating_firmware_updated_at = updating_firmware_updated_at;
	}
	public boolean isWifi_credentials_present() {
		return wifi_credentials_present;
	}
	public void setWifi_credentials_present(boolean wifi_credentials_present) {
		this.wifi_credentials_present = wifi_credentials_present;
	}
	public double getWifi_credentials_present_updated_at() {
		return wifi_credentials_present_updated_at;
	}
	public void setWifi_credentials_present_updated_at(double wifi_credentials_present_updated_at) {
		this.wifi_credentials_present_updated_at = wifi_credentials_present_updated_at;
	}
	public String getZigbee_mac_address() {
		return zigbee_mac_address;
	}
	public void setZigbee_mac_address(String zigbee_mac_address) {
		this.zigbee_mac_address = zigbee_mac_address;
	}
	public double getZigbee_mac_address_updated_at() {
		return zigbee_mac_address_updated_at;
	}
	public void setZigbee_mac_address_updated_at(double zigbee_mac_address_updated_at) {
		this.zigbee_mac_address_updated_at = zigbee_mac_address_updated_at;
	}
}