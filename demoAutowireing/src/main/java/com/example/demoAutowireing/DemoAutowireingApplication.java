package com.example.demoAutowireing;

import com.example.demoAutowireing.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAutowireingApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoAutowireingApplication.class, args);
		ctx.getBean(BankService.class).withdraw();
	}

}
