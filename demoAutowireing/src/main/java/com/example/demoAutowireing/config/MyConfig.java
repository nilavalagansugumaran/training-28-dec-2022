package com.example.demoAutowireing.config;

import com.example.demoAutowireing.MyBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    @ConditionalOnWebApplication
    public MyBean myBean(){

        return new MyBean();
    }
}
