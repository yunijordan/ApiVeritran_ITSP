package com.veritran.api.rest.common;

import java.util.Enumeration;

public class checkEligibilityRequest {
	private Integer tokenRequestorID;
	private String tokenReferenceID;
	private String panReferenceID;
	private String lifeCycleTraceID;
	private String encryptedData;
	
	///private Enumeration panSource;
	//private deviceinformation deviceInfo= new deviceinformation(deviceID, deviceLanguageCode);
	
	public Integer getTokenRequestorID() {
		return tokenRequestorID;
	}
	
	public void setTokenRequestorID(Integer tokenRequestorID) {
		this.tokenRequestorID = tokenRequestorID;
	}
	public String getTokenReferenceID() {
		return tokenReferenceID;
	}
	
	public String getPanReferenceID() {
		return panReferenceID;
	}
	
	public void setPanReferenceID(String panReferenceID) {
		this.panReferenceID = panReferenceID;
	}
	
	public void setTokenReferenceID(String tokenReferenceID) {
		this.tokenReferenceID = tokenReferenceID;
	}
	
	public String getLifeCycleTraceID() {
		return lifeCycleTraceID;
	}
	
	public void setLifeCycleTraceID(String lifeCycleTraceID) {
		this.lifeCycleTraceID = lifeCycleTraceID;
	}
	
	public String getEncryptedData() {
		return encryptedData;
	}
	
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}
	/*public Enumeration getPanSource() {
		return panSource;
	}
	public void setPanSource(Enumeration panSource) {
		this.panSource = panSource;
	}*/
	/*public deviceinformation getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(deviceinformation deviceInfo) {
		this.deviceInfo = deviceInfo;
	}*/
}
