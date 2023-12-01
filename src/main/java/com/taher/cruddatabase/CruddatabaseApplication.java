package com.taher.cruddatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={" com.controllers","com.taher.services"})
public class CruddatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddatabaseApplication.class, args);
	}

}
