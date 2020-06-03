package com.sapient.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleContorller {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("/ invoked...");
		return "Welcome";
	}
}
