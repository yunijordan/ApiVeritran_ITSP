package com.veritran.api.rest.service;

import java.io.Console;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.core.spi.factory.MessageBodyFactory;
import com.veritran.api.rest.common.*;
import com.veritran.api.rest.inboundRequest.approveProvisioningRequest;
import com.veritran.api.rest.inboundResponse.approveProvisioningResponse;

@Path("/vtis/v1")
public class ServiceEndPoints {
	
	private int tokenRequestorID;
	private String tokenReferenceID;
	
	@POST
	@Path("/checkEligibility")

	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public checkEligibilityResponse checkEligibility (checkEligibilityRequest request)
	
	{
		String cardArtRefID[] = {
						"ak0o23h6lu921rnturkutruj8h70q1jk",
						"bk0o23h6lu921rnturkutruj8h70q1jk",
						"ck0o23h6lu921rnturkutruj8h70q1jk",
						"k04o23h6lu921rnturkutruj8h70q1jk"
					};

		cardArtData cardArtData = new cardArtData(cardArtRefID);
		
		
		checkEligibilityResponse response = new checkEligibilityResponse();
		
		response.setErrorCode("Estamos del otro lado");
		
		cardmetadatainformation cardMetadataInfo = new cardmetadatainformation(request.getTokenReferenceID(), request.getTokenRequestorID().toString(),
								request.getPanReferenceID(), "labelColor", "shortDescription", "longDescription", "profileID", "termsAndConditionsID",
								"privacyPolicyURL", "termsAndConditionsURL", cardArtData);
		
		response.setCardMetadataInfo(cardMetadataInfo);
		
		applicationInfo applicationInfo = new applicationInfo(true);

		response.setApplicationInfo(applicationInfo);
		
		return response;
	}
	
	@POST
//	@Path("/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}/approveProvisioning")
	@Path("/tokenRequestors")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public approveProvisioningResponse approveProvisioning(approveProvisioningRequest request)
	{
		discretionarydatainformation issuerDiscretionaryData = 
				new discretionarydatainformation("fileControlInformation", "issuerApplicationDiscretionaryData");
		
		approveProvisioningResponse response = new approveProvisioningResponse(
				"00", null, "1", "M", "issuerSpecialConditionCodes", issuerDiscretionaryData);
		
		return response;
	}

	public int getTokenRequestorID() {
		return tokenRequestorID;
	}

	public void setTokenRequestorID(int tokenRequestorID) {
		this.tokenRequestorID = tokenRequestorID;
	}

	public String getTokenReferenceID() {
		return tokenReferenceID;
	}

	public void setTokenReferenceID(String tokenReferenceID) {
		this.tokenReferenceID = tokenReferenceID;
	}
}

