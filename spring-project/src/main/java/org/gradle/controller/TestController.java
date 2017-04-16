package org.gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	
	@RequestMapping("/")
	public String main() {
		System.out.println("test");
		return "hello";
	}

}
