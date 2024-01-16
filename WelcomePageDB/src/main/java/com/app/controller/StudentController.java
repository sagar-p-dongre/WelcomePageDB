package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {
	@GetMapping("/")
	public String Home() {
		return "hi";
	}
}
