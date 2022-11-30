package com.example.demoRestClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class MyRestClientCaller implements MyRestClient {

    private RestTemplate restTemplate;

    @Override
    public void callRestService() {

        restTemplate = new RestTemplate();

        Employee employee = restTemplate.getForObject("http://localhost:8080/employee/102", Employee.class);
        log.info("Employee from service {}", employee);


    }
}
