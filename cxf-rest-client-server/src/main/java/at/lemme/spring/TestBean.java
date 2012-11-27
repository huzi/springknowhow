package at.lemme.spring;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("testBean")
public class TestBean {
  
  private static final Logger log = Logger.getLogger(TestBean.class);
  
  @PostConstruct
  public void init(){
    log.debug("TestBean created");
  }

  public void logSomething(){
    log.debug("log something");
    log.info("log something");
    log.warn("log something");
    log.error("log something");
  }

}
