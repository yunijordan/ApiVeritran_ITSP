package com.veritran.api.rest.common;

public class tokeninformation {
	
	private String token;
	private String tokenType;
	private String tokenStatus;
	/*tokenExpirationDate*/
	private String tokenAssuranceLevel;
	private Integer numberOfActiveTokensForPAN;
	private Integer numberOfInactiveTokensForPAN;
	private Integer numberOfSuspendedTokensForPAN;
	private String tokenActivationDate;
	private String tokenDeactivationDate;
	private String lastTokenStatusUpdatedTime;
	private String originalToken;
	private Integer originalTokenRequestorID;
	private String originalTokenReferenceID;
	private String originalTokenAssuranceLevel;
	
	
	public tokeninformation(String token, String tokenType, String tokenStatus, String tokenAssuranceLevel,
			Integer numberOfActiveTokensForPAN, Integer numberOfInactiveTokensForPAN,
			Integer numberOfSuspendedTokensForPAN, String tokenActivationDate, String tokenDeactivationDate,
			String lastTokenStatusUpdatedTime, String originalToken, Integer originalTokenRequestorID,
			String originalTokenReferenceID, String originalTokenAssuranceLevel) {
		super();
		this.token = token;
		this.tokenType = tokenType;
		this.tokenStatus = tokenStatus;
		this.tokenAssuranceLevel = tokenAssuranceLevel;
		this.numberOfActiveTokensForPAN = numberOfActiveTokensForPAN;
		this.numberOfInactiveTokensForPAN = numberOfInactiveTokensForPAN;
		this.numberOfSuspendedTokensForPAN = numberOfSuspendedTokensForPAN;
		this.tokenActivationDate = tokenActivationDate;
		this.tokenDeactivationDate = tokenDeactivationDate;
		this.lastTokenStatusUpdatedTime = lastTokenStatusUpdatedTime;
		this.originalToken = originalToken;
		this.originalTokenRequestorID = originalTokenRequestorID;
		this.originalTokenReferenceID = originalTokenReferenceID;
		this.originalTokenAssuranceLevel = originalTokenAssuranceLevel;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getTokenType() {
		return tokenType;
	}


	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}


	public String getTokenStatus() {
		return tokenStatus;
	}


	public void setTokenStatus(String tokenStatus) {
		this.tokenStatus = tokenStatus;
	}


	public String getTokenAssuranceLevel() {
		return tokenAssuranceLevel;
	}


	public void setTokenAssuranceLevel(String tokenAssuranceLevel) {
		this.tokenAssuranceLevel = tokenAssuranceLevel;
	}


	public Integer getNumberOfActiveTokensForPAN() {
		return numberOfActiveTokensForPAN;
	}


	public void setNumberOfActiveTokensForPAN(Integer numberOfActiveTokensForPAN) {
		this.numberOfActiveTokensForPAN = numberOfActiveTokensForPAN;
	}


	public Integer getNumberOfInactiveTokensForPAN() {
		return numberOfInactiveTokensForPAN;
	}


	public void setNumberOfInactiveTokensForPAN(Integer numberOfInactiveTokensForPAN) {
		this.numberOfInactiveTokensForPAN = numberOfInactiveTokensForPAN;
	}


	public Integer getNumberOfSuspendedTokensForPAN() {
		return numberOfSuspendedTokensForPAN;
	}


	public void setNumberOfSuspendedTokensForPAN(Integer numberOfSuspendedTokensForPAN) {
		this.numberOfSuspendedTokensForPAN = numberOfSuspendedTokensForPAN;
	}


	public String getTokenActivationDate() {
		return tokenActivationDate;
	}


	public void setTokenActivationDate(String tokenActivationDate) {
		this.tokenActivationDate = tokenActivationDate;
	}


	public String getTokenDeactivationDate() {
		return tokenDeactivationDate;
	}


	public void setTokenDeactivationDate(String tokenDeactivationDate) {
		this.tokenDeactivationDate = tokenDeactivationDate;
	}


	public String getLastTokenStatusUpdatedTime() {
		return lastTokenStatusUpdatedTime;
	}


	public void setLastTokenStatusUpdatedTime(String lastTokenStatusUpdatedTime) {
		this.lastTokenStatusUpdatedTime = lastTokenStatusUpdatedTime;
	}


	public String getOriginalToken() {
		return originalToken;
	}


	public void setOriginalToken(String originalToken) {
		this.originalToken = originalToken;
	}


	public Integer getOriginalTokenRequestorID() {
		return originalTokenRequestorID;
	}


	public void setOriginalTokenRequestorID(Integer originalTokenRequestorID) {
		this.originalTokenRequestorID = originalTokenRequestorID;
	}


	public String getOriginalTokenReferenceID() {
		return originalTokenReferenceID;
	}


	public void setOriginalTokenReferenceID(String originalTokenReferenceID) {
		this.originalTokenReferenceID = originalTokenReferenceID;
	}


	public String getOriginalTokenAssuranceLevel() {
		return originalTokenAssuranceLevel;
	}


	public void setOriginalTokenAssuranceLevel(String originalTokenAssuranceLevel) {
		this.originalTokenAssuranceLevel = originalTokenAssuranceLevel;
	}
	
	
	
	
	

}
