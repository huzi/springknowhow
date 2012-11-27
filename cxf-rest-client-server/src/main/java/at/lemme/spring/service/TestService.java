package at.lemme.spring.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testService")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public interface TestService {

  /**
   * Produce a new order of a specified portfolio containing n cards.
   * 
   * @param orderRequest
   * @return @see CardOrder; general response handling @see RestService
   */
  @GET
  @Path("/method")
  public Response testMethod();
  
}
