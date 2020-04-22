package com.veritran.api.rest.common;

public class deviceinformation {
	
	private String deviceID;
	private String deviceLanguageCode;
	private String deviceType;
	private String deviceName;
	private String deviceNumber;
	private String osType;
	private String osVersion;
	private String osBuildID;
	private String deviceIDType;
	private String deviceManufacturer;
	private String deviceBrand;
	private String deviceModel;
	private String deviceLocation;
	private Integer deviceIndex;
	private String deviceIPAddressV4;
	private String locationSource;
	private String tokenProtectionMethod;
	
	
	public deviceinformation(String deviceID, String deviceLanguageCode) {
		super();
		this.deviceID = deviceID;
		this.deviceLanguageCode = deviceLanguageCode;
	}

     public deviceinformation()
     {
    	 
    	 
     }
	public deviceinformation(String deviceID, String deviceLanguageCode, String deviceType, String deviceName,
			String deviceNumber, String osType, String osVersion, String osBuildID, String deviceIDType,
			String deviceManufacturer, String deviceBrand, String deviceModel, String deviceLocation,
			Integer deviceIndex, String deviceIPAddressV4, String locationSource, String tokenProtectionMethod) {
		super();
		this.deviceID = deviceID;
		this.deviceLanguageCode = deviceLanguageCode;
		this.deviceType = deviceType;
		this.deviceName = deviceName;
		this.deviceNumber = deviceNumber;
		this.osType = osType;
		this.osVersion = osVersion;
		this.osBuildID = osBuildID;
		this.deviceIDType = deviceIDType;
		this.deviceManufacturer = deviceManufacturer;
		this.deviceBrand = deviceBrand;
		this.deviceModel = deviceModel;
		this.deviceLocation = deviceLocation;
		this.deviceIndex = deviceIndex;
		this.deviceIPAddressV4 = deviceIPAddressV4;
		this.locationSource = locationSource;
		this.tokenProtectionMethod = tokenProtectionMethod;
	}


	public String getDeviceID() {
		return deviceID;
	}


	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}


	public String getDeviceLanguageCode() {
		return deviceLanguageCode;
	}


	public void setDeviceLanguageCode(String deviceLanguageCode) {
		this.deviceLanguageCode = deviceLanguageCode;
	}


	public String getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	public String getDeviceName() {
		return deviceName;
	}


	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	public String getDeviceNumber() {
		return deviceNumber;
	}


	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}


	public String getOsType() {
		return osType;
	}


	public void setOsType(String osType) {
		this.osType = osType;
	}


	public String getOsVersion() {
		return osVersion;
	}


	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}


	public String getOsBuildID() {
		return osBuildID;
	}


	public void setOsBuildID(String osBuildID) {
		this.osBuildID = osBuildID;
	}


	public String getDeviceIDType() {
		return deviceIDType;
	}


	public void setDeviceIDType(String deviceIDType) {
		this.deviceIDType = deviceIDType;
	}


	public String getDeviceManufacturer() {
		return deviceManufacturer;
	}


	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}


	public String getDeviceBrand() {
		return deviceBrand;
	}


	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}


	public String getDeviceModel() {
		return deviceModel;
	}


	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}


	public String getDeviceLocation() {
		return deviceLocation;
	}


	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}


	public Integer getDeviceIndex() {
		return deviceIndex;
	}


	public void setDeviceIndex(Integer deviceIndex) {
		this.deviceIndex = deviceIndex;
	}


	public String getdeviceIPAddressV4() {
		return deviceIPAddressV4;
	}


	public void setdeviceIPAddressV4(String deviceIPAddressV4) {
		this.deviceIPAddressV4 = deviceIPAddressV4;
	}


	public String getLocationSource() {
		return locationSource;
	}


	public void setLocationSource(String locationSource) {
		this.locationSource = locationSource;
	}


	public String getTokenProtectionMethod() {
		return tokenProtectionMethod;
	}


	public void setTokenProtectionMethod(String tokenProtectionMethod) {
		this.tokenProtectionMethod = tokenProtectionMethod;
	}
	
	
	
	
	

}
