package com.example.demoBeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyLazyBean {

    public MyLazyBean() {
        System.out.println("MyLazyBean initialised");
    }

    @Override
    public String toString() {
        return "MyLazyBean{}";
    }
}
