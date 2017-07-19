package org.sw.api;


import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.sw.api.model.User;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface UserService {
	
	@PUT
	public String createUser(@QueryParam("emailId") String emailId, @QueryParam("location") String location, @QueryParam("name") String name, @QueryParam("timeZone") String timeZone) throws IOException;

	@GET
	@Path("/{userid}")
	public User getUser(@PathParam("userid") String userid);
	
	@PUT
	@Path("/initpair/{userid}/{appname}")
	public String initpair(@PathParam("userid") String userid, @PathParam("appname") String appName) throws IOException;
}
