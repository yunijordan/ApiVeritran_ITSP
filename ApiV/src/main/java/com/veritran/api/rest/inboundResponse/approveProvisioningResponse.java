package com.veritran.api.rest.inboundResponse;

import com.veritran.api.rest.common.discretionarydatainformation;

public class approveProvisioningResponse {
	
	private String actionCode;
	private String errorCode;
	private String addressVerificationResultCode;
	private String cvv2ResultsCode;
	private String issuerSpecialConditionCodes;
	private discretionarydatainformation issuerDiscretionaryData;

	
	public approveProvisioningResponse(String actionCode, String errorCode, String addressVerificationResultCode,
			String cvv2ResultsCode, String issuerSpecialConditionCodes,
			discretionarydatainformation issuerDiscretionaryData) {
		super();
		this.actionCode = actionCode;
		this.errorCode = errorCode;
		this.addressVerificationResultCode = addressVerificationResultCode;
		this.cvv2ResultsCode = cvv2ResultsCode;
		this.issuerSpecialConditionCodes = issuerSpecialConditionCodes;
		this.issuerDiscretionaryData = issuerDiscretionaryData;
	}
	
	public approveProvisioningResponse() {}

	public String getActionCode() {
		return actionCode;
	}


	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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


	public String getIssuerSpecialConditionCodes() {
		return issuerSpecialConditionCodes;
	}

	public void setIssuerSpecialConditionCodes(String issuerSpecialConditionCodes) {
		this.issuerSpecialConditionCodes = issuerSpecialConditionCodes;
	}

	public discretionarydatainformation getIssuerDiscretionaryData() {
		return issuerDiscretionaryData;
	}


	public void setIssuerDiscretionaryData(discretionarydatainformation issuerDiscretionaryData) {
		this.issuerDiscretionaryData = issuerDiscretionaryData;
	}

}
