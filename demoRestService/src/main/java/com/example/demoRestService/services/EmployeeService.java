package com.example.demoRestService.services;

import com.example.demoRestService.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class EmployeeService {

    private static Map<Integer, Employee> employeeRepository = new ConcurrentHashMap<>();

    public Employee getEmployeeById(int id) {
        Employee employee =  employeeRepository.get(id);
        if(employee!=null) {
            return employee;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, " employee not found");
    }

    public void createEmployee(Employee employee) {
        employeeRepository.put(employee.getId(), employee);
    }

    public void updateEmployee(int id, Employee employee) {
        Employee orgEmployee = getEmployeeById(id);
        orgEmployee.setSalary(employee.getSalary());
        employeeRepository.put(employee.getId(), orgEmployee);
    }

    public void deleteEmployee(int id) {
        Employee orgEmployee = getEmployeeById(id);
        employeeRepository.remove(id);
    }

}
