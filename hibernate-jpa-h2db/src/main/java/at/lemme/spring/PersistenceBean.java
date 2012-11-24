package at.lemme.spring;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;

@Component("persistenceBean")
public class PersistenceBean {
  
  @Inject
  private EntityManager em;
  

}
