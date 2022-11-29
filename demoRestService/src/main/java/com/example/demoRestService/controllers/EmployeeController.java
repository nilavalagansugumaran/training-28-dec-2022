package com.example.demoRestService.controllers;

import com.example.demoRestService.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    //create

    //read
    @GetMapping(path = "/employee", produces = {"application/json", "application/xml"})
    public Employee getEmployee(@RequestParam( name = "name", required = false) String name){

        return Employee.builder().id(1).name(name).salary(2000.00).email("nila@nila.com").build();
    }


    //update

    //delete
}
