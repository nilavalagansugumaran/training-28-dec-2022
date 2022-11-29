package com.example.demoActuator;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationConfiguration {

    @Bean
    @ConditionalOnNotWebApplication
    public MyBean myBean(){
        return new MyBean("This is my simple bean");
    }

    @Bean
    @ConditionalOnWebApplication
    @ConditionalOnProperty(prefix = "name", name ="enabled", havingValue = "false")
    public MyBean myOtherBean(){
        return new MyBean("This is web application bean");
    }

    @Bean
    @ConditionalOnProperty(prefix = "name", name ="enabled", havingValue = "true")
    public MyBean mypropertyBean(){
        return new MyBean("This is based on property");
    }
}
