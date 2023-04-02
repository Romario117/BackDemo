package com.romario.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp1Application.class, args);
	}

}
