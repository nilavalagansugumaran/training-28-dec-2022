package com.example.demoRestService.controllers;

import com.example.demoRestService.models.Employee;
import com.example.demoRestService.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    //create
    @PostMapping(path = "/employee", produces = {"application/json", "application/xml"}, consumes = {"application/json", "application/xml"})
    public void createEmployee(@RequestBody Employee employee){
        service.createEmployee(employee);
    }
    
    //read
    @GetMapping(path = "/employee/{id}", produces = {"application/json", "application/xml"})
    public Employee getEmployee(@RequestParam( name = "name", required = false) String name,@PathVariable("id") int id){

       // return Employee.builder().id(id).name(name).salary(2000.00).email("nila@nila.com").build();

        return service.getEmployeeById(id);
    }


    //update

    //delete
}
