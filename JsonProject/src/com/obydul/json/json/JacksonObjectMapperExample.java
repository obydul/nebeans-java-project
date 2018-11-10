package com.obydul.json.json;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.obydul.json.model.Address;
import com.obydul.json.model.Employee;

public class JacksonObjectMapperExample {

//https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
    
    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp = objectMapper.readValue(jsonData, Employee.class);
        System.out.println("Employee Object\n" + emp);
        Employee emp1 = createEmployee();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, emp1);
        System.out.println("Employee JSON is\n" + stringEmp);

    }

    public static Employee createEmployee() {
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("Obydul");
        emp.setPermanent(false);
        emp.setPhoneNumbers(new long[]{123456, 987654});
        emp.setRole("Trainee Programmer");

        Address add = new Address();
        add.setCity("Dhaka");
        add.setStreet("Kallyanpur");
        add.setZipcode(1207);
        emp.setAddress(add);

        List<String> cities = new ArrayList<>();
        cities.add("Dhaka");
        cities.add("Rangpur");
        emp.setCities(cities);

        Map<String, String> props = new HashMap<>();
        props.put("salary", "10000 taka");
        props.put("age", "28 years");
        emp.setProperties(props);
        return emp;

    }

}
