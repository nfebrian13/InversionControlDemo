package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nana.profiles.controllers.GreetingController;

@SpringBootApplication
@ComponentScan("com.nana.profiles")
public class Springbot {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(Springbot.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}