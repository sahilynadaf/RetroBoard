package com.hzSro.RetroBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RetroBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetroBoardApplication.class, args);
	}

}
