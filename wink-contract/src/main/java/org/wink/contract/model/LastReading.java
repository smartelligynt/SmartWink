package org.wink.contract.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LastReading {
	private String general_tos_version;

	private String general_tos_version_updated_at;

	public String getGeneral_tos_version() {
		return general_tos_version;
	}

	public void setGeneral_tos_version(String general_tos_version) {
		this.general_tos_version = general_tos_version;
	}

	public String getGeneral_tos_version_updated_at() {
		return general_tos_version_updated_at;
	}

	public void setGeneral_tos_version_updated_at(String general_tos_version_updated_at) {
		this.general_tos_version_updated_at = general_tos_version_updated_at;
	}
}