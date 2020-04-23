package com.veritran.api.rest.inboundRequest;


import com.veritran.api.rest.common.deviceinformation;
import com.veritran.api.rest.common.termsandconditions;

public class tokenCreateNotificationRequest {
	
	 private String messageReason;
	 private String messageReasonCode;//enum
	 //private DateTime dateTimeOfEvent;//  poner fecha 
	 private String panReferenceID;
	 private int lifeCycleTraceID;
	 private String walletAccountEmailAddressHash;
	 private String clientWalletAccountId;
	 private String panSource;
	 private String addressVerificationResultCode;
	 private String cvv2ResultsCode;
	 private String consumerEntryMode;///enum
	 private String locale;
	 private deviceinformation deviceInfo;
	 private String encryptedData;//Todo: See JWS encryption
	 private String actionCode;
	 private termsandconditions termsandconditions;
	 
	 
	 
	 public tokenCreateNotificationRequest() {
		 super();
	 }
	 

	public String getMessageReason() {
		return messageReason;
	}
	public void setMessageReason(String messageReason) {
		this.messageReason = messageReason;
	}
	public String getMessageReasonCode() {
		return messageReasonCode;
	}
	public void setMessageReasonCode(String messageReasonCode) {
		this.messageReasonCode = messageReasonCode;
	}
	
	/*public DateTimeSyntax getDateTimeOfEvent() {
		return dateTimeOfEvent;
	}
	public void setDateTimeOfEvent(DateTimeSyntax dateTimeOfEvent) {
		this.dateTimeOfEvent = dateTimeOfEvent;
	}*/
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
	public String getClientWalletAccountId() {
		return clientWalletAccountId;
	}
	public void setClientWalletAccountId(String clientWalletAccountId) {
		this.clientWalletAccountId = clientWalletAccountId;
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
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public termsandconditions getTermsandconditions() {
		return termsandconditions;
	}
	public void setTermsandconditions(termsandconditions termsandconditions) {
		this.termsandconditions = termsandconditions;
	}
	 
	 
	

}
