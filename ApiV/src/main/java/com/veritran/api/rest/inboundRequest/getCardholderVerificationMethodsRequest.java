package com.veritran.api.rest.inboundRequest;

import com.veritran.api.rest.common.deviceinformation;
import com.veritran.api.rest.common.merchantinformation;
import com.veritran.api.rest.common.tokenuserinformation;

public class getCardholderVerificationMethodsRequest {
	
	private int tokenRequestorID;
	private String tokenReferenceID;
	private String panReferenceID;
	private int lifeCycleTraceID;
	private String clientWalletAccountID;
	private String panSource;
	private String otpReason;
	private boolean otpMaxReached;
	private deviceinformation deviceInfo;
	private String encryptedData;
	private tokenuserinformation tokenUserInfo;
	private merchantinformation merchantInfo;
}
