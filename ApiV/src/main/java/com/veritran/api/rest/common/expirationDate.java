package com.veritran.api.rest.common;

public class expirationDate {
	 private String month;
	 private String year;
	 
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public expirationDate(String month, String year) {
		super();
		this.month = month;
		this.year = year;
	}
	 
	 

}
