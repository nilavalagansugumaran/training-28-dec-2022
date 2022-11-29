package com.example.demoActuator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class DemoActuatorApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoActuatorApplication.class, args);
		log.info(ctx.getBean(MyBean.class).toString());
	}

}
