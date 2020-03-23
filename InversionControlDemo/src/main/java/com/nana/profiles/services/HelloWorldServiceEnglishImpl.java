package com.nana.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService{

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
