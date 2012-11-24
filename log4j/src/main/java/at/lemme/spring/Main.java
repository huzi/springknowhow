package at.lemme.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import at.lemme.spring.model.Pojo;

public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

    TestBean bean = ctx.getBean(TestBean.class);

    Pojo pojo1 = bean.insertObject();
    System.out.println(pojo1);
    Long id = pojo1.getId();
    
    Pojo pojo2 = bean.findObject(id);
    System.out.println(pojo2);
  }

}
