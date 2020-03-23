package com.nana.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nana.profiles.controllers.GreetingController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		GreetingController controller =  (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}