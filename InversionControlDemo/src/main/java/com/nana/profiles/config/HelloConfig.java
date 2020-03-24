package com.nana.profiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.nana.profiles.services.HelloWorldFactory;
import com.nana.profiles.services.HelloWorldService;

@Configuration
public class HelloConfig {

/**	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	} **/

	@Bean
	@Profile("english")
	@Primary
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}

	@Bean
	@Profile("spanish")
	@Primary
	public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}

/**	@Bean(name = "french")
	public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	} **/

	@Bean
	public HelloWorldService helloWorldServiceGerany(HelloWorldFactory factory) {
		return factory.createHelloWorldService("de");
	}

	@Bean
	public HelloWorldService helloWorldServicePoland(HelloWorldFactory factory) {
		return factory.createHelloWorldService("pl");
	}

	@Bean
	@Profile("russian")
	public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
		return factory.createHelloWorldService("ru");
	}

	/*
	 * @Bean
	 * 
	 * @Profile("english") public HelloWorldService helloWorldServiceEnglish() {
	 * return new HelloWorldServiceEnglish(); }
	 */

	/*
	 * @Bean
	 * 
	 * @Profile("spanish") public HelloWorldService helloWorldServiceSpanish() {
	 * return new HelloWorldServiceSpanish(); }
	 */

}
