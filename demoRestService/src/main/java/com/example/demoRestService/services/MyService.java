package com.example.demoRestService.services;

import com.example.demoRestService.models.Employee;

import java.util.List;

public interface MyService {

    Employee getEmployeeById(int id);
    void createEmployee(Employee employee);
    void updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
    List<Employee> getAllEmployees();
}
