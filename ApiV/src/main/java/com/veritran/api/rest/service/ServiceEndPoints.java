package com.veritran.api.rest.service;

import java.io.Console;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.veritran.api.rest.common.*;
import com.veritran.api.rest.inboundRequest.approveProvisioningRequest;
import com.veritran.api.rest.inboundRequest.approveProvisioningStandInRequest;
import com.veritran.api.rest.inboundRequest.sendPasscodeRequest;
import com.veritran.api.rest.inboundRequest.tokenCreateNotificationRequest;
import com.veritran.api.rest.inboundRequest.tokenNotificationRequest;
import com.veritran.api.rest.inboundResponse.approveProvisioningResponse;

@Path("/vtis/v1")
public class ServiceEndPoints {
	
	private Integer tokenRequestorID;
	private String tokenReferenceID;
	private String eventType;//Todo enum
	
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
		
		/*cardmetadatainformation cardMetadataInfo = new cardmetadatainformation(request.getTokenReferenceID(), request.getTokenRequestorID().toString(),
								request.getPanReferenceID(), "labelColor", "shortDescription", "longDescription", "profileID", "termsAndConditionsID",
								"privacyPolicyURL", "termsAndConditionsURL");*/
		
		cardmetadatainformation cardMetadataInfo = new cardmetadatainformation("cardIssuer", "foregroundColor", "backgroundColor", "labelColor", "shortDescription", "longDescription",
				"profileID", "termsAndConditionsID", cardArtData, "privacyPolicyURL", "termsAndConditionsURL");
		
		response.setCardMetadataInfo(cardMetadataInfo);
		
		applicationInfo applicationInfo = new applicationInfo(true);

		response.setApplicationInfo(applicationInfo);
		
		return response;
	}
	
	@POST
	@Path("/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}/approveProvisioning")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public approveProvisioningResponse approveProvisioning(approveProvisioningRequest request, @PathParam("tokenRequestorID") Integer tokenRequestorID, @PathParam("tokenReferenceID") String tokenReferenceID)
	{
		discretionarydatainformation issuerDiscretionaryData = 
				new discretionarydatainformation("fileControlInformation", "issuerApplicationDiscretionaryData");
		
		approveProvisioningResponse response = new approveProvisioningResponse(
				"00", null, "1", "M", "issuerSpecialConditionCodes", issuerDiscretionaryData);
    
		return response;
	}
	
	@POST
	@Path("/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}/tokenChanged")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response ApproveProvisioningSIN (approveProvisioningStandInRequest request,  @PathParam("tokenRequestorID") Integer tokenRequestorID,@PathParam("tokenReferenceID") String tokenReferenceID 
			, @QueryParam("eventType") String eventType)  {
		
		String json = " HTTP 200 OK";
			    return Response.ok(json, MediaType.APPLICATION_JSON).build();
	
	}
	
	@POST
	@Path("/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}/tokentest1")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response tokenCreateNotification ( tokenCreateNotificationRequest request, @PathParam("tokenRequestorID") String tokenRequestorID,  @PathParam("tokenReferenceID") String tokenReferenceID, @QueryParam("eventType") String eventType)  {
			
		
		String json1 = " HTTP 200 OK";
			    return Response.ok(json1, MediaType.APPLICATION_JSON).build();
	}


	@POST
	@Path("/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}/tokenotification")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response tokenNotification (tokenNotificationRequest request,  @PathParam("tokenRequestorID") Integer tokenRequestorID,@PathParam("tokenReferenceID")
	String tokenReferenceID , @QueryParam("eventType") String eventType)  {
		
		String json1 = " HTTP 200 OK";
			    return Response.ok(json1, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/sendPasscode")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response sendPasscode (sendPasscodeRequest request)  {
		
		String json1 = " HTTP 200 OK";
			    return Response.ok(json1, MediaType.APPLICATION_JSON).build();
	}
	
	
	public void setTokenReferenceID(String tokenReferenceID) {
		this.tokenReferenceID = tokenReferenceID;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setTokenRequestorID(Integer tokenRequestorID) {
		this.tokenRequestorID = tokenRequestorID;
	}

}

