package com.example.demoJms;

import com.example.demoJms.sender.MySender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoJmsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoJmsApplication.class, args);
		ctx.getBean(MySender.class).sendMyMessage();
	}

}
