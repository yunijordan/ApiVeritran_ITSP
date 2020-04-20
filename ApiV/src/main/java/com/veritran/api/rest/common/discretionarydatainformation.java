package com.veritran.api.rest.common;

public class discretionarydatainformation {
	
	
	private String fileControlInformation;
	private String issuerApplicationDiscretionaryData;
	
	
	public discretionarydatainformation(String fileControlInformation, String issuerApplicationDiscretionaryData) {
		super();
		this.fileControlInformation = fileControlInformation;
		this.issuerApplicationDiscretionaryData = issuerApplicationDiscretionaryData;
	}


	public String getFileControlInformation() {
		return fileControlInformation;
	}


	public void setFileControlInformation(String fileControlInformation) {
		this.fileControlInformation = fileControlInformation;
	}


	public String getIssuerApplicationDiscretionaryData() {
		return issuerApplicationDiscretionaryData;
	}


	public void setIssuerApplicationDiscretionaryData(String issuerApplicationDiscretionaryData) {
		this.issuerApplicationDiscretionaryData = issuerApplicationDiscretionaryData;
	}	

}
