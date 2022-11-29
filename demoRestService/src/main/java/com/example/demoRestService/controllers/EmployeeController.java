package com.example.demoRestService.controllers;

import com.example.demoRestService.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    //create

    //read
    @GetMapping(path = "/employee/{id}", produces = {"application/json", "application/xml"})
    public Employee getEmployee(@RequestParam( name = "name", required = false) String name,@PathVariable("id") int id){

        return Employee.builder().id(id).name(name).salary(2000.00).email("nila@nila.com").build();
    }


    //update

    //delete
}
