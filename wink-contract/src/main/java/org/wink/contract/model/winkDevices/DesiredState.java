package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DesiredState {
	private int pairing_mode_duration;
	private Double brightness;
	private Boolean powered;

	public int getPairing_mode_duration() {
		return pairing_mode_duration;
	}

	public void setPairing_mode_duration(int pairing_mode_duration) {
		this.pairing_mode_duration = pairing_mode_duration;
	}

	public Double getBrightness() {
		return brightness;
	}

	public void setBrightness(Double brightness) {
		this.brightness = brightness;
	}

	public Boolean getPowered() {
		return powered;
	}

	public void setPowered(Boolean powered) {
		this.powered = powered;
	}

}