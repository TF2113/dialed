package com.tom.dialed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DialedApplication {

	public static void main(String[] args) {
        SpringApplication.run(DialedApplication.class, args);
	}
}
