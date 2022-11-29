package com.example.demoProfilesAndConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "employee")
public class Employee {

    private String name;
    private String email;
    private Address address;

    @ToString
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {

        private String postcode;
    }
}
