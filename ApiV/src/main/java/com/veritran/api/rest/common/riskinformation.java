package com.veritran.api.rest.common;

public class riskinformation {
	
	private String walletProviderRiskAssessment;
	private String walletProviderRiskAssessmentVersion;
	private String walletProviderAccountScore;
	private String walletProviderDeviceScore;
	private String walletProviderReasonCodes;
	private String deviceBluetoothMac;
	private String deviceIMEI;
	private String deviceSerialNumber;
	private String deviceTimeZone;
	private String deviceTimeZoneSetting;
	private String osID;
	private String simSerialNumber;
	private String deviceLostMode;
	private String daysSinceConsumerDataLastAccountChange;
	private String accountHolderName;
	private String walletProviderPANAge;
	private String walletAccountHolderCardNameMatch;
	private String accountToDeviceBindingAge;
	private String userAccountAge;
	private String provisioningAttemptsOnDeviceIn24Hours;
	private String distinctCardholderNames;
	private String deviceCountry;
	private String walletAccountCountry;
	private String suspendedCardsInAccount;
	private String daysSinceLastAccountActivity;
	private String numberOfTransactionsInLast12months;
	private String numberOfActiveTokens;
	private String deviceWithActiveTokens;
	private String activeTokensOnAllDeviceForAccount;
	private String visaTokenScore;
	private String visaTokenDecisioning;
	private String riskAssessmentScore;
	private String issuerSpecialConditionCodes;
	
	
	public riskinformation(String walletProviderRiskAssessment, String walletProviderRiskAssessmentVersion,
			String walletProviderAccountScore, String walletProviderDeviceScore, String walletProviderReasonCodes,
			String deviceBluetoothMac, String deviceIMEI, String deviceSerialNumber, String deviceTimeZone,
			String deviceTimeZoneSetting, String osID, String simSerialNumber, String deviceLostMode,
			String daysSinceConsumerDataLastAccountChange, String accountHolderName, String walletProviderPANAge,
			String walletAccountHolderCardNameMatch, String accountToDeviceBindingAge, String userAccountAge,
			String provisioningAttemptsOnDeviceIn24Hours, String distinctCardholderNames, String deviceCountry,
			String walletAccountCountry, String suspendedCardsInAccount, String daysSinceLastAccountActivity,
			String numberOfTransactionsInLast12months, String numberOfActiveTokens, String deviceWithActiveTokens,
			String activeTokensOnAllDeviceForAccount, String visaTokenScore, String visaTokenDecisioning,
			String riskAssessmentScore, String issuerSpecialConditionCodes) {
		super();
		this.walletProviderRiskAssessment = walletProviderRiskAssessment;
		this.walletProviderRiskAssessmentVersion = walletProviderRiskAssessmentVersion;
		this.walletProviderAccountScore = walletProviderAccountScore;
		this.walletProviderDeviceScore = walletProviderDeviceScore;
		this.walletProviderReasonCodes = walletProviderReasonCodes;
		this.deviceBluetoothMac = deviceBluetoothMac;
		this.deviceIMEI = deviceIMEI;
		this.deviceSerialNumber = deviceSerialNumber;
		this.deviceTimeZone = deviceTimeZone;
		this.deviceTimeZoneSetting = deviceTimeZoneSetting;
		this.osID = osID;
		this.simSerialNumber = simSerialNumber;
		this.deviceLostMode = deviceLostMode;
		this.daysSinceConsumerDataLastAccountChange = daysSinceConsumerDataLastAccountChange;
		this.accountHolderName = accountHolderName;
		this.walletProviderPANAge = walletProviderPANAge;
		this.walletAccountHolderCardNameMatch = walletAccountHolderCardNameMatch;
		this.accountToDeviceBindingAge = accountToDeviceBindingAge;
		this.userAccountAge = userAccountAge;
		this.provisioningAttemptsOnDeviceIn24Hours = provisioningAttemptsOnDeviceIn24Hours;
		this.distinctCardholderNames = distinctCardholderNames;
		this.deviceCountry = deviceCountry;
		this.walletAccountCountry = walletAccountCountry;
		this.suspendedCardsInAccount = suspendedCardsInAccount;
		this.daysSinceLastAccountActivity = daysSinceLastAccountActivity;
		this.numberOfTransactionsInLast12months = numberOfTransactionsInLast12months;
		this.numberOfActiveTokens = numberOfActiveTokens;
		this.deviceWithActiveTokens = deviceWithActiveTokens;
		this.activeTokensOnAllDeviceForAccount = activeTokensOnAllDeviceForAccount;
		this.visaTokenScore = visaTokenScore;
		this.visaTokenDecisioning = visaTokenDecisioning;
		this.riskAssessmentScore = riskAssessmentScore;
		this.issuerSpecialConditionCodes = issuerSpecialConditionCodes;
	}


	public String getWalletProviderRiskAssessment() {
		return walletProviderRiskAssessment;
	}


	public void setWalletProviderRiskAssessment(String walletProviderRiskAssessment) {
		this.walletProviderRiskAssessment = walletProviderRiskAssessment;
	}


	public String getWalletProviderRiskAssessmentVersion() {
		return walletProviderRiskAssessmentVersion;
	}


	public void setWalletProviderRiskAssessmentVersion(String walletProviderRiskAssessmentVersion) {
		this.walletProviderRiskAssessmentVersion = walletProviderRiskAssessmentVersion;
	}


	public String getWalletProviderAccountScore() {
		return walletProviderAccountScore;
	}


	public void setWalletProviderAccountScore(String walletProviderAccountScore) {
		this.walletProviderAccountScore = walletProviderAccountScore;
	}


	public String getWalletProviderDeviceScore() {
		return walletProviderDeviceScore;
	}


	public void setWalletProviderDeviceScore(String walletProviderDeviceScore) {
		this.walletProviderDeviceScore = walletProviderDeviceScore;
	}


	public String getWalletProviderReasonCodes() {
		return walletProviderReasonCodes;
	}


	public void setWalletProviderReasonCodes(String walletProviderReasonCodes) {
		this.walletProviderReasonCodes = walletProviderReasonCodes;
	}


	public String getDeviceBluetoothMac() {
		return deviceBluetoothMac;
	}


	public void setDeviceBluetoothMac(String deviceBluetoothMac) {
		this.deviceBluetoothMac = deviceBluetoothMac;
	}


	public String getDeviceIMEI() {
		return deviceIMEI;
	}


	public void setDeviceIMEI(String deviceIMEI) {
		this.deviceIMEI = deviceIMEI;
	}


	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}


	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}


	public String getDeviceTimeZone() {
		return deviceTimeZone;
	}


	public void setDeviceTimeZone(String deviceTimeZone) {
		this.deviceTimeZone = deviceTimeZone;
	}


	public String getDeviceTimeZoneSetting() {
		return deviceTimeZoneSetting;
	}


	public void setDeviceTimeZoneSetting(String deviceTimeZoneSetting) {
		this.deviceTimeZoneSetting = deviceTimeZoneSetting;
	}


	public String getOsID() {
		return osID;
	}


	public void setOsID(String osID) {
		this.osID = osID;
	}


	public String getSimSerialNumber() {
		return simSerialNumber;
	}


	public void setSimSerialNumber(String simSerialNumber) {
		this.simSerialNumber = simSerialNumber;
	}


	public String getDeviceLostMode() {
		return deviceLostMode;
	}


	public void setDeviceLostMode(String deviceLostMode) {
		this.deviceLostMode = deviceLostMode;
	}


	public String getDaysSinceConsumerDataLastAccountChange() {
		return daysSinceConsumerDataLastAccountChange;
	}


	public void setDaysSinceConsumerDataLastAccountChange(String daysSinceConsumerDataLastAccountChange) {
		this.daysSinceConsumerDataLastAccountChange = daysSinceConsumerDataLastAccountChange;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public String getWalletProviderPANAge() {
		return walletProviderPANAge;
	}


	public void setWalletProviderPANAge(String walletProviderPANAge) {
		this.walletProviderPANAge = walletProviderPANAge;
	}


	public String getWalletAccountHolderCardNameMatch() {
		return walletAccountHolderCardNameMatch;
	}


	public void setWalletAccountHolderCardNameMatch(String walletAccountHolderCardNameMatch) {
		this.walletAccountHolderCardNameMatch = walletAccountHolderCardNameMatch;
	}


	public String getAccountToDeviceBindingAge() {
		return accountToDeviceBindingAge;
	}


	public void setAccountToDeviceBindingAge(String accountToDeviceBindingAge) {
		this.accountToDeviceBindingAge = accountToDeviceBindingAge;
	}


	public String getUserAccountAge() {
		return userAccountAge;
	}


	public void setUserAccountAge(String userAccountAge) {
		this.userAccountAge = userAccountAge;
	}


	public String getProvisioningAttemptsOnDeviceIn24Hours() {
		return provisioningAttemptsOnDeviceIn24Hours;
	}


	public void setProvisioningAttemptsOnDeviceIn24Hours(String provisioningAttemptsOnDeviceIn24Hours) {
		this.provisioningAttemptsOnDeviceIn24Hours = provisioningAttemptsOnDeviceIn24Hours;
	}


	public String getDistinctCardholderNames() {
		return distinctCardholderNames;
	}


	public void setDistinctCardholderNames(String distinctCardholderNames) {
		this.distinctCardholderNames = distinctCardholderNames;
	}


	public String getDeviceCountry() {
		return deviceCountry;
	}


	public void setDeviceCountry(String deviceCountry) {
		this.deviceCountry = deviceCountry;
	}


	public String getWalletAccountCountry() {
		return walletAccountCountry;
	}


	public void setWalletAccountCountry(String walletAccountCountry) {
		this.walletAccountCountry = walletAccountCountry;
	}


	public String getSuspendedCardsInAccount() {
		return suspendedCardsInAccount;
	}


	public void setSuspendedCardsInAccount(String suspendedCardsInAccount) {
		this.suspendedCardsInAccount = suspendedCardsInAccount;
	}


	public String getDaysSinceLastAccountActivity() {
		return daysSinceLastAccountActivity;
	}


	public void setDaysSinceLastAccountActivity(String daysSinceLastAccountActivity) {
		this.daysSinceLastAccountActivity = daysSinceLastAccountActivity;
	}


	public String getNumberOfTransactionsInLast12months() {
		return numberOfTransactionsInLast12months;
	}


	public void setNumberOfTransactionsInLast12months(String numberOfTransactionsInLast12months) {
		this.numberOfTransactionsInLast12months = numberOfTransactionsInLast12months;
	}


	public String getNumberOfActiveTokens() {
		return numberOfActiveTokens;
	}


	public void setNumberOfActiveTokens(String numberOfActiveTokens) {
		this.numberOfActiveTokens = numberOfActiveTokens;
	}


	public String getDeviceWithActiveTokens() {
		return deviceWithActiveTokens;
	}


	public void setDeviceWithActiveTokens(String deviceWithActiveTokens) {
		this.deviceWithActiveTokens = deviceWithActiveTokens;
	}


	public String getActiveTokensOnAllDeviceForAccount() {
		return activeTokensOnAllDeviceForAccount;
	}


	public void setActiveTokensOnAllDeviceForAccount(String activeTokensOnAllDeviceForAccount) {
		this.activeTokensOnAllDeviceForAccount = activeTokensOnAllDeviceForAccount;
	}


	public String getVisaTokenScore() {
		return visaTokenScore;
	}


	public void setVisaTokenScore(String visaTokenScore) {
		this.visaTokenScore = visaTokenScore;
	}


	public String getVisaTokenDecisioning() {
		return visaTokenDecisioning;
	}


	public void setVisaTokenDecisioning(String visaTokenDecisioning) {
		this.visaTokenDecisioning = visaTokenDecisioning;
	}


	public String getRiskAssessmentScore() {
		return riskAssessmentScore;
	}


	public void setRiskAssessmentScore(String riskAssessmentScore) {
		this.riskAssessmentScore = riskAssessmentScore;
	}


	public String getIssuerSpecialConditionCodes() {
		return issuerSpecialConditionCodes;
	}


	public void setIssuerSpecialConditionCodes(String issuerSpecialConditionCodes) {
		this.issuerSpecialConditionCodes = issuerSpecialConditionCodes;
	}
	
	
	
	
	
	
	

}
