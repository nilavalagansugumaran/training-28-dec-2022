package com.example.demoRestService.services;

import com.example.demoRestService.models.Employee;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class EmployeeService {

    private static Map<Integer, Employee> employeeRepository = new ConcurrentHashMap<>();

    public Employee getEmployeeById(int id) {
        return employeeRepository.get(id);
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
