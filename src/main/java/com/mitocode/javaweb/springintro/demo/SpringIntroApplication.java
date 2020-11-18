package com.mitocode.javaweb.springintro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mitocode.javaweb.springintro.thymeleaf")
public class SpringIntroApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
	}
	
}
