package com.example.demoTests.controller;

import com.example.demoTests.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employee", produces = "application/json")
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder().id(101L).name("Nila").build());
        employeeList.add(Employee.builder().id(102L).name("Joe").build());
        return employeeList;
    }
}
