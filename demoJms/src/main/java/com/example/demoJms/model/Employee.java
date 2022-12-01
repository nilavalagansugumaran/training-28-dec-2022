package com.example.demoJms.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Employee implements Serializable {

    private String name;
    private String message;
}
