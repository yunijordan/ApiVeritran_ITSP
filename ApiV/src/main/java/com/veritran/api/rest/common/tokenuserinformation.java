package com.veritran.api.rest.common;

public class tokenuserinformation {
	
	private Integer tokenUserID;
	private Integer tokenUserAppType;
	
	
	public tokenuserinformation(Integer tokenUserID, Integer tokenUserAppType) {
		super();
		this.tokenUserID = tokenUserID;
		this.tokenUserAppType = tokenUserAppType;
	}
	
	public tokenuserinformation() {
		super();
	}


	public Integer getTokenUserID() {
		return tokenUserID;
	}


	public void setTokenUserID(Integer tokenUserID) {
		this.tokenUserID = tokenUserID;
	}


	public Integer getTokenUserAppType() {
		return tokenUserAppType;
	}


	public void setTokenUserAppType(Integer tokenUserAppType) {
		this.tokenUserAppType = tokenUserAppType;
	}
	
	
	
	
	

}
