package com.example.demoProfilesAndConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Contact {
    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
