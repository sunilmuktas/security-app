package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringSecurityOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

}
