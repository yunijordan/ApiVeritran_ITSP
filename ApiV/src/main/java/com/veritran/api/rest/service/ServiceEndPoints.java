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
		String cardArtRefID[] = {"ak0o23h6lu921rnturkutruj8h70q1jk",
		         "bk0o23h6lu921rnturkutruj8h70q1jk",
		         "ck0o23h6lu921rnturkutruj8h70q1jk",
		         "k04o23h6lu921rnturkutruj8h70q1jk"};
		
		cardArtData cardArtData = new cardArtData(cardArtRefID);
		
		
		checkEligibilityResponse response = new checkEligibilityResponse();
		response.setErrorCode("Estamos del otro lado");
		
		cardmetadatainformation cardMetadataInfo = new cardmetadatainformation(item.getTokenReferenceID(), item.getTokenRequestorID().toString(),
								item.getPanReferenceID(), "labelColor", "shortDescription", "longDescription", "profileID", "termsAndConditionsID",
								"privacyPolicyURL", "termsAndConditionsURL", cardArtData);
		
		response.setCardMetadataInfo(cardMetadataInfo);
		applicationInfo applicationInfo = new applicationInfo(true);
		response.setApplicationInfo(applicationInfo);
		
		return response;
	}
}

