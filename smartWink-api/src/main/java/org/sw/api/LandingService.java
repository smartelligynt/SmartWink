package org.sw.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/landing")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface LandingService {
	
	@GET
	public String getAccess(@QueryParam("state") String state, 
			@QueryParam("code") String code, 
			@QueryParam("refreshToken") String refreshToken,
			@QueryParam("userName") String userName,
			@QueryParam("password") String password);
	@GET
	@Path("{userId}")
	public String getUser(@PathParam("userId") String userId);
}
