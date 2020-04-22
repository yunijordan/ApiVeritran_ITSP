package com.veritran.api.rest.common;

public class merchantinformation {
	
	private Integer merchantID;
	private String merchantName;
	
	
	public merchantinformation(Integer merchantID, String merchantName) {
		super();
		this.merchantID = merchantID;
		this.merchantName = merchantName;
	}
	
	public merchantinformation() {
		super();
	}


	public Integer getMerchantID() {
		return merchantID;
	}


	public void setMerchantID(Integer merchantID) {
		this.merchantID = merchantID;
	}


	public String getMerchantName() {
		return merchantName;
	}


	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	

}
