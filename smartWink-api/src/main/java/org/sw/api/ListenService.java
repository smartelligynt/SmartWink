package org.sw.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sw.api.model.PubNubTopic;

@Path("/listen")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.WILDCARD})
public interface ListenService {
	
	@POST
	public void listen(PubNubTopic topic);
	
	@Path("/{userId}/start")
	@GET
	public void startListen(@PathParam("userId") String userId);
	
	@Path("/{userId}/{winkId}/start")
	@GET
	public void startListen(@PathParam("userId") String userId, @PathParam("winkId") String winkId);
	
	@Path("/{userId}/stop")
	@GET
	public void stopListen(@PathParam("userId") String userId);
}
