package com.obydul.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/obydul/spring/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello2 = (Hello) context2.getBean("hello");
        hello2.sayHello();

    }

}
