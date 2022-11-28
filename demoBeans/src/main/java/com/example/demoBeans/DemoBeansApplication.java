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

		MyBean obj1 = ctx.getBean(MyBean.class);
		MyBean obj2 = (MyBean) ctx.getBean("nila");
		if(obj1.equals(obj2)) {
			System.out.println("Same objects");
		} else {
			System.out.println("both are different objects");
		}
	}

}
