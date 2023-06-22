package com.sunglowsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class NewDayApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewDayApplication.class, args);

		System.out.println("application working");
	}


}