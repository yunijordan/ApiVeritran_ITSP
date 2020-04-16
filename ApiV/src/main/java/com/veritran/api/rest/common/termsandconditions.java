package com.veritran.api.rest.common;

public class termsandconditions {
	
	private String id;
	private String date;
	
	
	public termsandconditions(String id, String date) {
		super();
		this.id = id;
		this.date = date;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	

}
