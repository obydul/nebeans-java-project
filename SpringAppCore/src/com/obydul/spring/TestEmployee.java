package com.obydul.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/obydul/spring/applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.show();
    }

}
