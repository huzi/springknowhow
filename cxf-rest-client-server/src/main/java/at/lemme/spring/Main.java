package at.lemme.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

    TestBean bean = ctx.getBean(TestBean.class);

    bean.logSomething();

  }

}
