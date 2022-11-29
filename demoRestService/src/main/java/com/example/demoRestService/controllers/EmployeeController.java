package com.example.demoRestService.controllers;

import com.example.demoRestService.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    //create

    //read
    @GetMapping(path = "/employee", produces = {"application/json", "application/xml"})
    public Employee getEmployee(){

        return Employee.builder().id(1).name("nila").salary(2000.00).email("nila@nila.com").build();
    }


    //update

    //delete
}
