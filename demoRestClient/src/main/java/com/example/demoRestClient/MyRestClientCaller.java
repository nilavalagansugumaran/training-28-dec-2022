package com.example.demoRestClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class MyRestClientCaller implements MyRestClient {

    private RestTemplate restTemplate;

    @Override
    public void callRestService() {

        restTemplate = new RestTemplate();

        Employee employee = restTemplate.getForObject("http://localhost:8080/employee/102", Employee.class);
        log.info("Employee from service {}", employee);

        ParameterizedTypeReference<List<Employee>> employeeListType = new ParameterizedTypeReference<List<Employee>>() {};
        ResponseEntity<List<Employee>> response = restTemplate.exchange("http://localhost:8080/employee", HttpMethod.GET, null, employeeListType );
        log.info("Employee list from service status code = {}", response.getStatusCode());
        log.info("Employee list from service  body = {}", response.getBody());
        log.info("Employee list from service headers = {}", response.getHeaders().values().stream().collect(Collectors.toList()));

    }
}
