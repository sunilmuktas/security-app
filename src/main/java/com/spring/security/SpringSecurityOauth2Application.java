package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@EnableAutoConfiguration
@SpringBootApplication
@Profile("dev")
public class SpringSecurityOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

}
