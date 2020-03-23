package com.nana.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nana.profiles.services.HelloWorldService;
import com.nana.profiles.services.HelloWorldServiceEnglishImpl;
import com.nana.profiles.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {

	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglishImpl() {
		return new HelloWorldServiceEnglishImpl();
	}

	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanishImpl() {
		return new HelloWorldServiceSpanishImpl();
	}

}
