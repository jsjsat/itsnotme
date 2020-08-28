package jsjsat.games.itsnotme.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/game")
public class GameService {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createGame(String username, @Context HttpServletRequest request) {
		return Response.ok().build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTest(@Context HttpServletRequest request) {
		return Response.ok("test").build();
	}
}
