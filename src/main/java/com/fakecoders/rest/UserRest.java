package com.fakecoders.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {
	
	@GetMapping("/user")
	public String getAllUser() {
		return "all user list";
	}
}
