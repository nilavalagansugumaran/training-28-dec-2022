package com.example.demoAutowireing.config;

import com.example.demoAutowireing.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("new-name")
    public MyBean myBean(){

        return new MyBean();
    }
}
