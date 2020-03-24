package com.nana.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nana.profiles.controllers.GreetingController;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}