package com.example.demoTests.repository;

import com.example.demoTests.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testRepository(){
        //given
        entityManager.persist(Employee.builder().name("Nila").build());
        entityManager.persist(Employee.builder().name("Joe").build());

        //when
        List<Employee> employees = StreamSupport.stream(employeeRepository.findAll().spliterator(), false).collect(Collectors.toList());

        //then
        assertEquals(employees.size(), 2);
        assertEquals(employeeRepository.count(), 2);
    }
}