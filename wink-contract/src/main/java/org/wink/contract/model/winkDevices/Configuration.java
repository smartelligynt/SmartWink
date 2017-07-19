package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {
	private int kidde_radio_code;

	public int getKidde_radio_code() {
		return kidde_radio_code;
	}

	public void setKidde_radio_code(int kidde_radio_code) {
		this.kidde_radio_code = kidde_radio_code;
	}
}