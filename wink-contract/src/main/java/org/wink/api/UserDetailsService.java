package org.wink.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wink.contract.model.WinkUser;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON})
public interface UserDetailsService {

	@Path("/me")
	@GET
	WinkUser getUser(@HeaderParam("Authorization") String authCode, @HeaderParam("client_id") String client_id, @HeaderParam("client_secret") String client_secret);

	@Path("/me/wink_devices")
	@GET
	WinkUser getWinkDevices(@HeaderParam("Authorization") String authCode, @HeaderParam("client_id") String client_id, @HeaderParam("client_secret") String client_secret);
}
