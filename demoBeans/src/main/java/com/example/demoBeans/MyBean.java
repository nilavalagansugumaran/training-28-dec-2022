package com.example.demoBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("nila")
@Scope("prototype")
public class MyBean {
    public MyBean() {
        System.out.println("MyBean initialised");
    }

    @Override
    public String toString() {
        return "MyBean{}";
    }
}
