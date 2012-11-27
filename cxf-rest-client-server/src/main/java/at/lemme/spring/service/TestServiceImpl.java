package at.lemme.spring.service;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import at.lemme.spring.Dto;

@Component("testService")
public class TestServiceImpl implements TestService {

  @Override
  public Response testMethod() {
    
    Dto dto = new Dto();
    dto.setName("vorname");
    dto.setValue("tommi");
    return Response.ok().entity(dto).build();
  }

  
}
