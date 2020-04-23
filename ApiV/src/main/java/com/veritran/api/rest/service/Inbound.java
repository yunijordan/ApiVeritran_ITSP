package com.veritran.api.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.veritran.api.rest.common.discretionarydatainformation;
import com.veritran.api.rest.inboundRequest.approveProvisioningRequest;
import com.veritran.api.rest.inboundResponse.approveProvisioningResponse;

/*@Path("/vtis/v1/tokenRequestors/{tokenRequestorID}/tokens/{tokenReferenceID}")*/
public class Inbound {
	
	private int tokenRequestorID;
	private String tokenReferenceID;
	
	@POST
	///@Path("/approveProvisioning")

	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public approveProvisioningResponse approveProvisioning(approveProvisioningRequest request) {
		
		discretionarydatainformation issuerDiscretionaryData = 
				new discretionarydatainformation("fileControlInformation", "issuerApplicationDiscretionaryData");
		
		approveProvisioningResponse response = new approveProvisioningResponse(
				"00", null, "23", "N", "issuerSpecialConditionCodes", issuerDiscretionaryData);
		
		return response;
	}
	
}
