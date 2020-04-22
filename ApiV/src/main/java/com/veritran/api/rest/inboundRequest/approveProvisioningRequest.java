package com.veritran.api.rest.inboundRequest;

import com.veritran.api.rest.common.deviceinformation;
import com.veritran.api.rest.common.tokeninformation;

public class approveProvisioningRequest {
// private int tokenRequestorID;
// private String tokenReferenceID;
 
 private tokeninformation tokenInfo;
 private String panReferenceID;
 private int lifeCycleTraceID;
 private String walletAccountEmailAddressHash;
 private String clientWalletAccountID;
 private String panSource;
 private String addressVerificationResultCode;
 private String cvv2ResultsCode;
 private String consumerEntryMode;
 private String locale;
 private deviceinformation deviceInfo;
 private String encryptedData;//Todo: See JWS encryption

//public approveProvisioningRequest(String tokenRequestorID) {
//	this.panReferenceID = panReferenceID;
//}
 
public approveProvisioningRequest() {
	super();
}


public String getPanReferenceID() {
	return panReferenceID;
}

public void setPanReferenceID(String panReferenceID) {
	this.panReferenceID = panReferenceID;
}

public tokeninformation getTokenInfo() {
	return tokenInfo;
}

public void setTokenInfo(tokeninformation tokenInfo) {
	this.tokenInfo = tokenInfo;
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
