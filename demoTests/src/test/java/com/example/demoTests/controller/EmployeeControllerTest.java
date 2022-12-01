package com.example.demoTests.controller;

import com.example.demoTests.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void testEmployeeEndpoint(){
        //given
        ParameterizedTypeReference<List<Employee>> empList = new ParameterizedTypeReference<List<Employee>>() {
        };

        //when
        ResponseEntity<List<Employee>> response = restTemplate.exchange("/employee", HttpMethod.GET, null, empList);

        //then
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().size(), 2);

    }

}