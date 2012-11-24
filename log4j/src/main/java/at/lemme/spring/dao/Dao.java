package at.lemme.spring.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component("dao")
public class Dao {

  @PersistenceContext
  private EntityManager em;
  
  public void persist(Object entity) {
    em.persist(entity);
  }
  
  public <T> T find(Class<T> clazz, Object id) {
    return em.find(clazz, id);
  }
  
  
}
