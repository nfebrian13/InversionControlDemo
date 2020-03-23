package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        
     /* HelloWorldImpl helloWorldImpl = (HelloWorldImpl) ctx.getBean("helloWorld");
        helloWorldImpl.sayHello(); */
        
        InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        constructorService.getMessage();
        
    }
}
