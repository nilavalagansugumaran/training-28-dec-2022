package com.example.demoProfilesAndConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoProfilesAndConfigApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoProfilesAndConfigApplication.class, args);
		System.out.println(ctx.getBean(Contact.class).toString());
	}

}
