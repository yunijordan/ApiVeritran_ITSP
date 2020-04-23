package com.veritran.api.rest.common;

public class contactInfo {
	
	private String contactWebsite;
	private String contactEmail;
	private String contactNumber;
	private String contactName;
	
	
	public contactInfo(String contactWebsite, String contactEmail, String contactNumber, String contactName) {
		super();
		this.contactWebsite = contactWebsite;
		this.contactEmail = contactEmail;
		this.contactNumber = contactNumber;
		this.contactName = contactName;
	}


	public String getContactWebsite() {
		return contactWebsite;
	}


	public void setContactWebsite(String contactWebsite) {
		this.contactWebsite = contactWebsite;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
	

}
