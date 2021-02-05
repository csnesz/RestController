package com.example.hello_world;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalinakApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(BalinakApplication.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BalinakApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9001"));
		app.run(args);
	}

}
