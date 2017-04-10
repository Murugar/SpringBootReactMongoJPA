package com.iqmsoft.boot.react.jpa.companies.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.iqmsoft.boot.react.jpa.companies")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
