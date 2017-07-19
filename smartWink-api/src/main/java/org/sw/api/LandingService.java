package org.sw.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@Path("/pair")
	public String pair(@QueryParam("state") String state, 
			@QueryParam("code") String code);

	@GET
	@Path("/refresh")
	public String refreshAccess( 
			@QueryParam("refreshToken") String refreshToken);

	@GET
	@Path("/access")
	public String getAccess(
			@QueryParam("userName") String userName,
			@QueryParam("password") String password);
	@POST
	@Path("/{userId}/refresh")
	public String refreshAccessToken(
			@PathParam("userId") String userId);
}
