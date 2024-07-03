package com.example.dependency_injection_with_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionWithSpringBootApplication {
	public static void main(String[] args) {
		final ApplicationContext appContext = SpringApplication.run(DependencyInjectionWithSpringBootApplication.class, args);
		
		Laptop laptop = appContext.getBean(Laptop.class);
		laptop.display();
	}

}
