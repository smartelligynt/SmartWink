package org.wink.contract.model.winkDevices;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Datum {
	private Capabilities capabilities;
	private Configuration configuration;
	private int created_at;
	private DesiredState desired_state;
	private String device_manufacturer;
	private String gang_id;
	private String hub_id;
	private LastReading last_reading;
	private ArrayList<Double> lat_lng;
	private String light_bulb_id;
	private String local_id;
	private String locale;
	private String location;
	private String manufacturer_device_model;
	private String model_name;
	private String name;
	private Integer order;
	private String primary_upc_code;
	private String radio_type;
	private Subscription subscription;
	private Units units;
	private String upc_code;
	private String upc_id;
	private boolean update_needed;
	private String uuid;

	public Capabilities getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public DesiredState getDesired_state() {
		return desired_state;
	}

	public void setDesired_state(DesiredState desired_state) {
		this.desired_state = desired_state;
	}

	public String getDevice_manufacturer() {
		return device_manufacturer;
	}

	public void setDevice_manufacturer(String device_manufacturer) {
		this.device_manufacturer = device_manufacturer;
	}

	public String getGang_id() {
		return gang_id;
	}

	public void setGang_id(String gang_id) {
		this.gang_id = gang_id;
	}

	public String getHub_id() {
		return hub_id;
	}

	public void setHub_id(String hub_id) {
		this.hub_id = hub_id;
	}

	public LastReading getLast_reading() {
		return last_reading;
	}

	public void setLast_reading(LastReading last_reading) {
		this.last_reading = last_reading;
	}

	public ArrayList<Double> getLat_lng() {
		return lat_lng;
	}

	public void setLat_lng(ArrayList<Double> lat_lng) {
		this.lat_lng = lat_lng;
	}

	public String getLight_bulb_id() {
		return light_bulb_id;
	}

	public void setLight_bulb_id(String light_bulb_id) {
		this.light_bulb_id = light_bulb_id;
	}

	public String getLocal_id() {
		return local_id;
	}

	public void setLocal_id(String local_id) {
		this.local_id = local_id;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManufacturer_device_model() {
		return manufacturer_device_model;
	}

	public void setManufacturer_device_model(String manufacturer_device_model) {
		this.manufacturer_device_model = manufacturer_device_model;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getPrimary_upc_code() {
		return primary_upc_code;
	}

	public void setPrimary_upc_code(String primary_upc_code) {
		this.primary_upc_code = primary_upc_code;
	}

	public String getRadio_type() {
		return radio_type;
	}

	public void setRadio_type(String radio_type) {
		this.radio_type = radio_type;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	public String getUpc_code() {
		return upc_code;
	}

	public void setUpc_code(String upc_code) {
		this.upc_code = upc_code;
	}

	public String getUpc_id() {
		return upc_id;
	}

	public void setUpc_id(String upc_id) {
		this.upc_id = upc_id;
	}

	public boolean isUpdate_needed() {
		return update_needed;
	}

	public void setUpdate_needed(boolean update_needed) {
		this.update_needed = update_needed;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}