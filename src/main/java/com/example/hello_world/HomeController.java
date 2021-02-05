package com.example.hello_world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "I am Bond, James Bond. :)";
	}
	@RequestMapping("/ich")
	public String indexIch() {
		return "Ich bin Linda.";
	}
}
