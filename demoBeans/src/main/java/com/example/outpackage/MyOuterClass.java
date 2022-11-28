package com.example.outpackage;

import org.springframework.stereotype.Component;

@Component
public class MyOuterClass {

    @Override
    public String toString() {
        return "MyOuterClass{}";
    }
}
