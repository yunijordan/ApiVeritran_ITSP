package com.veritran.api.rest.inboundResponse;

import com.veritran.api.rest.common.stepUpMethodsDetails;

public class getCardholderVerificationMethodsResponse {
	
	private String errorCode;
	private stepUpMethodsDetails[] stepUpMethods;
	private String responseCode;
	
	
	public getCardholderVerificationMethodsResponse() {}


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public stepUpMethodsDetails[] getStepUpMethods() {
		return stepUpMethods;
	}


	public void setStepUpMethods(stepUpMethodsDetails[] stepUpMethods) {
		this.stepUpMethods = stepUpMethods;
	}


	public String getResponseCode() {
		return responseCode;
	}


	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
}
