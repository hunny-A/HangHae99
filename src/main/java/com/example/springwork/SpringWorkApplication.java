package com.example.springwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWorkApplication.class, args);
	}

}
