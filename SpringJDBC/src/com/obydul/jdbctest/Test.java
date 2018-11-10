package com.obydul.jdbctest;

import com.obydul.jdbcdao.EmployeeDao;
import com.obydul.jdbcdao.HibernateDao;
import com.obydul.jdbcmodel.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/obydul/jdbctest/spring-jdbc.xml");

//        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
//        System.out.println(employeeDao.saveEmployee(new Employee("Islam", 13500)));
//        
//        
//        EmployeeDao employeeDao1 = (EmployeeDao) context.getBean("employeeDao");
//        System.out.println(employeeDao1.saveEmployeePS(new Employee("ABC", 15260)));
//        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
//        System.out.println(employeeDao.getEmployeebyId(2));
//
//        System.out.print(employeeDao.getAllEmployee(2).getId() + " ");
//        System.out.print(employeeDao.getAllEmployee(2).getName() + " ");
//        System.out.println(employeeDao.getAllEmployee(2).getSalary());
//        
//        
//        
//        System.out.print(employeeDao.getAllEmployeeList(3).get(0).getId() + " ");
//        System.out.print(employeeDao.getAllEmployeeList(3).get(0).getName() + " ");
//        System.out.println(employeeDao.getAllEmployeeList(3).get(0).getSalary());

        //System.out.println(employeeDao.saveEmployeeNPS(new Employee("DEF", 95120)));
        //hibernate part
        HibernateDao hibernateDao = (HibernateDao) context.getBean("hibernateDao");
        System.out.println(hibernateDao.getEmployee());

    }

}
