package com.nana.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nana.profiles.services.HelloWorldFactory;
import com.nana.profiles.services.HelloWorldService;

@Configuration
public class HelloConfig {

	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}

	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}

	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}
	
	@Bean
	@Profile("russian")
	public HelloWorldService helloWorldServiceRussianImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("ru");
	}

	/*
	 * @Bean
	 * 
	 * @Profile("english") public HelloWorldService helloWorldServiceEnglishImpl() {
	 * return new HelloWorldServiceEnglishImpl(); }
	 */

	/*
	 * @Bean
	 * 
	 * @Profile("spanish") public HelloWorldService helloWorldServiceSpanishImpl() {
	 * return new HelloWorldServiceSpanishImpl(); }
	 */

}
