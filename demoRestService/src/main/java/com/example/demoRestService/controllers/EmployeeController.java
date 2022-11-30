package com.example.demoRestService.controllers;

import com.example.demoRestService.models.Employee;
import com.example.demoRestService.services.EmployeeService;
import com.example.demoRestService.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    private MyService service;
    @Autowired
    public EmployeeController(MyService service) {
        this.service = service;
    }

    //create
    @PostMapping(path = "/employee", produces = {"application/json", "application/xml"}, consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
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
    @PutMapping(path = "/employee/{id}", produces = {"application/json", "application/xml"}, consumes = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id){
        service.updateEmployee(id, employee);
    }

    //delete
    @DeleteMapping(path = "/employee/{id}", produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id") int id){
        service.deleteEmployee(id);
    }

    @GetMapping(path = "/employee", produces = {"application/json", "application/xml"})
   // @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<List<Employee>> readAllEmployees(){

        return ResponseEntity.ok().header("x-size", String.valueOf(service.getAllEmployees().size())).body(service.getAllEmployees());
    }
}
