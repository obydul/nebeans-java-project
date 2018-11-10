package com.obydul.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/obydul/spring/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        
    }
}
