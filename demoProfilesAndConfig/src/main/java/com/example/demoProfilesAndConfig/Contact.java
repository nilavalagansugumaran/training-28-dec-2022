package com.example.demoProfilesAndConfig;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {
    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;
}
