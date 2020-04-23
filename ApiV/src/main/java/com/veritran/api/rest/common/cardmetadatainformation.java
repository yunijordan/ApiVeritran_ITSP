package com.veritran.api.rest.common;

public class cardmetadatainformation {
	
	private String cardIssuer;
	private String foregroundColor;
	private String backgroundColor;
	private String labelColor;
	private String shortDescription;
	private String longDescription;
	private String profileID;
	private String termsAndConditionsID;
	private cardArtData cardArtData;
	private String privacyPolicyURL;
	private String termsAndConditionsURL;
	/*private contactInfo contactInfo;
	private applicationInfo applicationInfo;*/
	
	public cardmetadatainformation() {}

	public cardmetadatainformation(String cardIssuer, String foregroundColor, String backgroundColor, String labelColor,
			String shortDescription, String longDescription, String profileID, String termsAndConditionsID,
			com.veritran.api.rest.common.cardArtData cardArtData, String privacyPolicyURL,
			String termsAndConditionsURL) {
		super();
		this.cardIssuer = cardIssuer;
		this.foregroundColor = foregroundColor;
		this.backgroundColor = backgroundColor;
		this.labelColor = labelColor;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.profileID = profileID;
		this.termsAndConditionsID = termsAndConditionsID;
		this.cardArtData = cardArtData;
		this.privacyPolicyURL = privacyPolicyURL;
		this.termsAndConditionsURL = termsAndConditionsURL;
	}

	public cardArtData getCardArtData() {
		return cardArtData;
	}

	public void setCardArtData(cardArtData cardArtData) {
		this.cardArtData = cardArtData;
	}
		public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getForegroundColor() {
		return foregroundColor;
	}

	public void setForegroundColor(String foregroundColor) {
		this.foregroundColor = foregroundColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}


	public String getLabelColor() {
		return labelColor;
	}


	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	public String getProfileID() {
		return profileID;
	}


	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}


	public String getTermsAndConditionsID() {
		return termsAndConditionsID;
	}


	public void setTermsAndConditionsID(String termsAndConditionsID) {
		this.termsAndConditionsID = termsAndConditionsID;
	}


	public String getPrivacyPolicyURL() {
		return privacyPolicyURL;
	}


	public void setPrivacyPolicyURL(String privacyPolicyURL) {
		this.privacyPolicyURL = privacyPolicyURL;
	}


	public String getTermsAndConditionsURL() {
		return termsAndConditionsURL;
	}


	public void setTermsAndConditionsURL(String termsAndConditionsURL) {
		this.termsAndConditionsURL = termsAndConditionsURL;
	}

}
