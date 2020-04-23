package com.veritran.api.rest.inboundRequest;

import com.veritran.api.rest.common.deviceinformation;
import com.veritran.api.rest.common.merchantinformation;
import com.veritran.api.rest.common.tokenuserinformation;

public class tokenNotificationRequest {
	
	 private String messageReason;
	 private String messageReasonCode;//enum
	 //private DateTime dateTimeOfEvent;//  poner fecha 
	 private String panReferenceID;
	 private int lifeCycleTraceID;
	 private String encryptedData;//Todo: See JWS encryption
	 private String deviceID;
	 private deviceinformation deviceInfo;
	 private tokenuserinformation tokenUserInfo;
	 private merchantinformation merchantInfo;
	 private String actionCode;
	 private String activationVerificationResult;//enum 
	 private String cardHolderStepupResult;//enum
	 private String deviceBindingResult;//enum
	 private String trustedListingResult;//enum
	 
	 public tokenNotificationRequest() {
	 
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
	public String getEncryptedData() {
		return encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public deviceinformation getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(deviceinformation deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public tokenuserinformation getTokenUserInfo() {
		return tokenUserInfo;
	}
	public void setTokenUserInfo(tokenuserinformation tokenUserInfo) {
		this.tokenUserInfo = tokenUserInfo;
	}
	public merchantinformation getMerchantInfo() {
		return merchantInfo;
	}
	public void setMerchantInfo(merchantinformation merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getActivationVerificationResult() {
		return activationVerificationResult;
	}
	public void setActivationVerificationResult(String activationVerificationResult) {
		this.activationVerificationResult = activationVerificationResult;
	}
	public String getCardHolderStepupResult() {
		return cardHolderStepupResult;
	}
	public void setCardHolderStepupResult(String cardHolderStepupResult) {
		this.cardHolderStepupResult = cardHolderStepupResult;
	}
	public String getDeviceBindingResult() {
		return deviceBindingResult;
	}
	public void setDeviceBindingResult(String deviceBindingResult) {
		this.deviceBindingResult = deviceBindingResult;
	}
	public String getTrustedListingResult() {
		return trustedListingResult;
	}
	public void setTrustedListingResult(String trustedListingResult) {
		this.trustedListingResult = trustedListingResult;
	}
	 
	 
	 
	 
	 
	 

}
