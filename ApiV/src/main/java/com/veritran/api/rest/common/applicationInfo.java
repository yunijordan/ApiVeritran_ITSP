package com.veritran.api.rest.common;

public class applicationInfo {
	
	private Boolean supportsTokenNotifications;
	private Boolean supportsFPANNotifications;
	private String transactionServiceURL;
	private String messageServiceURL;
	private String transactionPushTopic;
	private String messagePushTopic;
	private String appLaunchURL;
	private String associatedStoreIdentifiers;
	private String appLaunchURLScheme;
	private String associatedApplicationIdentifiers;
	
	
	public applicationInfo(Boolean supportsTokenNotifications, Boolean supportsFPANNotifications,
			String transactionServiceURL, String messageServiceURL, String transactionPushTopic,
			String messagePushTopic, String appLaunchURL, String associatedStoreIdentifiers, String appLaunchURLScheme,
			String associatedApplicationIdentifiers) {
		super();
		this.supportsTokenNotifications = supportsTokenNotifications;
		this.supportsFPANNotifications = supportsFPANNotifications;
		this.transactionServiceURL = transactionServiceURL;
		this.messageServiceURL = messageServiceURL;
		this.transactionPushTopic = transactionPushTopic;
		this.messagePushTopic = messagePushTopic;
		this.appLaunchURL = appLaunchURL;
		this.associatedStoreIdentifiers = associatedStoreIdentifiers;
		this.appLaunchURLScheme = appLaunchURLScheme;
		this.associatedApplicationIdentifiers = associatedApplicationIdentifiers;
	}

	public applicationInfo(Boolean supportsTokenNotifications){
		this.supportsTokenNotifications = supportsTokenNotifications;
	}
	
	public applicationInfo(){
		super();
	}
	
	public Boolean getSupportsTokenNotifications() {
		return supportsTokenNotifications;
	}


	public void setSupportsTokenNotifications(Boolean supportsTokenNotifications) {
		this.supportsTokenNotifications = supportsTokenNotifications;
	}


	public Boolean getSupportsFPANNotifications() {
		return supportsFPANNotifications;
	}


	public void setSupportsFPANNotifications(Boolean supportsFPANNotifications) {
		this.supportsFPANNotifications = supportsFPANNotifications;
	}


	public String getTransactionServiceURL() {
		return transactionServiceURL;
	}


	public void setTransactionServiceURL(String transactionServiceURL) {
		this.transactionServiceURL = transactionServiceURL;
	}


	public String getMessageServiceURL() {
		return messageServiceURL;
	}


	public void setMessageServiceURL(String messageServiceURL) {
		this.messageServiceURL = messageServiceURL;
	}


	public String getTransactionPushTopic() {
		return transactionPushTopic;
	}


	public void setTransactionPushTopic(String transactionPushTopic) {
		this.transactionPushTopic = transactionPushTopic;
	}


	public String getMessagePushTopic() {
		return messagePushTopic;
	}


	public void setMessagePushTopic(String messagePushTopic) {
		this.messagePushTopic = messagePushTopic;
	}


	public String getAppLaunchURL() {
		return appLaunchURL;
	}


	public void setAppLaunchURL(String appLaunchURL) {
		this.appLaunchURL = appLaunchURL;
	}


	public String getAssociatedStoreIdentifiers() {
		return associatedStoreIdentifiers;
	}


	public void setAssociatedStoreIdentifiers(String associatedStoreIdentifiers) {
		this.associatedStoreIdentifiers = associatedStoreIdentifiers;
	}


	public String getAppLaunchURLScheme() {
		return appLaunchURLScheme;
	}


	public void setAppLaunchURLScheme(String appLaunchURLScheme) {
		this.appLaunchURLScheme = appLaunchURLScheme;
	}


	public String getAssociatedApplicationIdentifiers() {
		return associatedApplicationIdentifiers;
	}


	public void setAssociatedApplicationIdentifiers(String associatedApplicationIdentifiers) {
		this.associatedApplicationIdentifiers = associatedApplicationIdentifiers;
	}
	
	
	
	
	
	

}
