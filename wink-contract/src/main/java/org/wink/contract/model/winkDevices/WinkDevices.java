package org.wink.contract.model.winkDevices;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.wink.contract.model.Pagination;

@XmlAccessorType(XmlAccessType.FIELD)
public class WinkDevices {
	private List<Datum> data;
	private Pagination pagination;

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}