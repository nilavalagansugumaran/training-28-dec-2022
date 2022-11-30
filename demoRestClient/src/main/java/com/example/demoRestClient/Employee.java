package com.example.demoRestClient;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private String name;
    private int id;
    private Double salary;
    private String email;
}
