package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.example.demo")
//@SpringBootApplication
public class CrudEmployeeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeeSpringBootApplication.class, args);
	}

}
