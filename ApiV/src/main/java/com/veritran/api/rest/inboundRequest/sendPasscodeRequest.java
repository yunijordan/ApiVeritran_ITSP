package com.veritran.api.rest.inboundRequest;

import com.veritran.api.rest.common.deviceinformation;

public class sendPasscodeRequest {
	
	private Integer tokenRequestorID;
	private String tokenReferenceID;
	private String panReferenceID;
	private String lifeCycleTraceID;
	private String clientWalletAccountID;
	private String otpMethodIdentifier;
	private String otpValue;
	private String otpReason;
	//DateTime otpExpirationDate;
	private deviceinformation deviceInfo;
	private String encryptedData;
	
	
	
	public Integer getTokenRequestorID() {
		return tokenRequestorID;
	}
	public void setTokenRequestorID(Integer tokenRequestorID) {
		this.tokenRequestorID = tokenRequestorID;
	}
	public String getTokenReferenceID() {
		return tokenReferenceID;
	}
	public void setTokenReferenceID(String tokenReferenceID) {
		this.tokenReferenceID = tokenReferenceID;
	}
	public String getPanReferenceID() {
		return panReferenceID;
	}
	public void setPanReferenceID(String panReferenceID) {
		this.panReferenceID = panReferenceID;
	}
	public String getLifeCycleTraceID() {
		return lifeCycleTraceID;
	}
	public void setLifeCycleTraceID(String lifeCycleTraceID) {
		this.lifeCycleTraceID = lifeCycleTraceID;
	}
	public String getClientWalletAccountID() {
		return clientWalletAccountID;
	}
	public void setClientWalletAccountID(String clientWalletAccountID) {
		this.clientWalletAccountID = clientWalletAccountID;
	}
	public String getOtpMethodIdentifier() {
		return otpMethodIdentifier;
	}
	public void setOtpMethodIdentifier(String otpMethodIdentifier) {
		this.otpMethodIdentifier = otpMethodIdentifier;
	}
	public String getOtpValue() {
		return otpValue;
	}
	public void setOtpValue(String otpValue) {
		this.otpValue = otpValue;
	}
	public String getOtpReason() {
		return otpReason;
	}
	public void setOtpReason(String otpReason) {
		this.otpReason = otpReason;
	}
	public deviceinformation getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(deviceinformation deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getEncryptedData() {
		return encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}
	
	
	
	

}
