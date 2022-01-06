package com.example.HelloworldService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldServiceApplication.class, args);
		System.out.println("Hello World Service");
	}

}
