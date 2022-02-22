package com.learn.multipleParaSp.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustGuId {
	private String custGuId;

	@JsonCreator
	public CustGuId(@JsonProperty("CustGuId") String custGuId) {
		super();
		this.custGuId = custGuId;
	}

	public String getCustGuId() {
		return custGuId;
	}

	public void setCustGuId(String custGuId) {
		this.custGuId = custGuId;
	}
	
}
