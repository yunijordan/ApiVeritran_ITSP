package com.veritran.api.rest.inboundRequest;

import javax.print.attribute.DateTimeSyntax;

import com.veritran.api.rest.common.deviceinformation;

public class approveProvisioningStandInRequest {
	
	 private String panReferenceID;
	 private int lifeCycleTraceID;
	 private String walletAccountEmailAddressHash;
	 private String clientWalletAccountID;
	 private String panSource;
	 private String addressVerificationResultCode;
	 private String cvv2ResultsCode;
	 private String consumerEntryMode;///enum
	 private String locale;
	 private deviceinformation deviceInfo;
	 private String encryptedData;//Todo: See JWS encryption
	 private String actionCode;
	 private String stipReasonCode;
	 private DateTimeSyntax dateTimeOfEvent;
	 
	 
	 
	 
	 
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getStipReasonCode() {
		return stipReasonCode;
	}
	public void setStipReasonCode(String stipReasonCode) {
		this.stipReasonCode = stipReasonCode;
	}
	public DateTimeSyntax getDateTimeOfEvent() {
		return dateTimeOfEvent;
	}
	public void setDateTimeOfEvent(DateTimeSyntax dateTimeOfEvent) {
		this.dateTimeOfEvent = dateTimeOfEvent;
	}
	public String getPanReferenceID() {
		return panReferenceID;
	}
	public void setPanReferenceID(String panReferenceID) {
		this.panReferenceID = panReferenceID;
	}
	public int getLifeCycleTraceID() {
		return lifeCycleTraceID;
	}
	public void setLifeCycleTraceID(int lifeCycleTraceID) {
		this.lifeCycleTraceID = lifeCycleTraceID;
	}
	public String getWalletAccountEmailAddressHash() {
		return walletAccountEmailAddressHash;
	}
	public void setWalletAccountEmailAddressHash(String walletAccountEmailAddressHash) {
		this.walletAccountEmailAddressHash = walletAccountEmailAddressHash;
	}
	public String getClientWalletAccountID() {
		return clientWalletAccountID;
	}
	public void setClientWalletAccountID(String clientWalletAccountID) {
		this.clientWalletAccountID = clientWalletAccountID;
	}
	public String getPanSource() {
		return panSource;
	}
	public void setPanSource(String panSource) {
		this.panSource = panSource;
	}
	public String getAddressVerificationResultCode() {
		return addressVerificationResultCode;
	}
	public void setAddressVerificationResultCode(String addressVerificationResultCode) {
		this.addressVerificationResultCode = addressVerificationResultCode;
	}
	public String getCvv2ResultsCode() {
		return cvv2ResultsCode;
	}
	public void setCvv2ResultsCode(String cvv2ResultsCode) {
		this.cvv2ResultsCode = cvv2ResultsCode;
	}
	public String getConsumerEntryMode() {
		return consumerEntryMode;
	}
	public void setConsumerEntryMode(String consumerEntryMode) {
		this.consumerEntryMode = consumerEntryMode;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
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
