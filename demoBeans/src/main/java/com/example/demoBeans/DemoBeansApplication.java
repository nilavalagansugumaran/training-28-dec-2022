package com.example.demoBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoBeansApplication {

	public static void main(String[] args) {
		// got the context
		ApplicationContext ctx = SpringApplication.run(DemoBeansApplication.class, args);

		//now access the bean
		System.out.println(ctx.getBean(MyBean.class).toString());

		System.out.println(ctx.getBean("nila").toString());

	}

}
