package com.veritran.api.rest.service;

import java.io.Console;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.veritran.api.rest.common.*;

@Path("/vtis/v1")
public class ServiceEndPoints {
	@POST
	@Path("/checkEligibility")

	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public checkEligibilityResponse checkEligibility (checkEligibilityRequest item )
	
	{
		checkEligibilityResponse response = new checkEligibilityResponse();
		response.setErrorCode("Estamos del otro lado");
		cardmetadatainformation cardMetadataInfo = new cardmetadatainformation(item.getTokenReferenceID(), item.getTokenRequestorID().toString(),
								item.getPanReferenceID(), "labelColor", "shortDescription", "longDescription", "profileID", "termsAndConditionsID",
								"privacyPolicyURL", "termsAndConditionsURL");
		response.setCardMetadataInfo(cardMetadataInfo);
		applicationInfo applicationInfo = new applicationInfo(true);
		response.setApplicationInfo(applicationInfo);
		return response;
	}
}

