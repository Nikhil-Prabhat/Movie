package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.controller","com.model","com.service"})
public class Movie1Application {

	public static void main(String[] args) {
		SpringApplication.run(Movie1Application.class, args);
	}

}
