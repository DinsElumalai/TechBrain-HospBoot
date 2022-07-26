package com.medical.hospboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class HospBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospBootApplication.class, args);
	}

}
