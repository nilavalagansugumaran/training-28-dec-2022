package com.example.demoProfilesAndConfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class DemoProfilesAndConfigApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoProfilesAndConfigApplication.class, args);
		//System.out.println(ctx.getBean(Contact.class).toString());
		log.info("this contact bean {}",ctx.getBean(Contact.class).toString() );
	}

}
