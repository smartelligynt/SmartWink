package org.sw.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/orchestrate")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface OrchService {
	
	@GET
	public void orchestrate(@QueryParam("refreshToken")@DefaultValue("AgAaNEzuNsERNfdD8UU3f0QcDBkMK4-Z") String refreshToken);
}
