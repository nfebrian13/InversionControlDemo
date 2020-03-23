package demo;

import org.springframework.stereotype.Component;

/**
 * Created by Nana on 26/03/2020.
 */
@Component
public class HelloWorldImpl implements HelloWorldService {
	public void sayHello() {
		System.out.println("Hello World!!!!");
	}
}
