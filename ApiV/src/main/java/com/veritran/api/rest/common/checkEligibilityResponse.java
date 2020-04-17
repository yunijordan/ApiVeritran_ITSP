package com.veritran.api.rest.common;

public class checkEligibilityResponse {
	private cardmetadatainformation cardMetadataInfo;
	private String errorCode;
	private applicationInfo applicationInfo;
	
	public cardmetadatainformation getCardMetadataInfo() {
		return cardMetadataInfo;
	}
	public void setCardMetadataInfo(cardmetadatainformation cardMetadataInfo) {
		this.cardMetadataInfo = cardMetadataInfo;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public applicationInfo getApplicationInfo() {
		return applicationInfo;
	}
	public void setApplicationInfo(applicationInfo applicationInfo) {
		this.applicationInfo = applicationInfo;
	}
}
