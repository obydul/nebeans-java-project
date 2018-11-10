package com.obydul.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/obydul/spring/applicationContext.xml");
        context.registerShutdownHook();
        Hello helo = (Hello) context.getBean("hello");
        helo.setMessage("Hello Spring");
        System.out.println(helo.getMessage());

//        ApplicationContext context2 = new AnnotationConfigApplicationContext(HelloConfig.class);
//        Hello hello2 = (Hello) context2.getBean("hello");
//        hello2.setMessage("Hello Spring 2");
//        System.out.println(hello2.getMessage());
    }
}
