package at.lemme.spring;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import at.lemme.spring.dao.Dao;
import at.lemme.spring.model.Pojo;

@Component("testBean")
public class TestBean {

  @Inject
  private Dao dao;

  @Transactional
  public Pojo insertObject() {
    Pojo pojo = new Pojo();
    pojo.setName("testObject");
    dao.persist(pojo);
    return pojo;
  }
  
  public Pojo findObject(Long id){
    return dao.find(Pojo.class, id);
  }

}
