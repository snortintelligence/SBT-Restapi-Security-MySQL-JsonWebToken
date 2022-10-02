package com.snort.intelli.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JWTApplication {

	public static void main(String[] args) {
		log.info("JWTApplication Bootstrap app started...");
		SpringApplication.run(JWTApplication.class, args);
	}

}
