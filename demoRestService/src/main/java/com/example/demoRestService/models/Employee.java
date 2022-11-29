package com.example.demoRestService.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JacksonXmlRootElement
public class Employee {

    private String name;
    private int id;
    private Double salary;
    private String email;
}
