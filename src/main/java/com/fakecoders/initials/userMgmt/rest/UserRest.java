package com.fakecoders.initials.userMgmt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fakecoders.initials.userMgmt.model.Users;
import com.fakecoders.initials.userMgmt.service.impl.IUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class UserRest {
	public static final Logger logger = LoggerFactory.getLogger(UserRest.class);
	@Autowired 
	IUsersService userService;
	@GetMapping("/getAllUsers")
	@ResponseBody
	public List<Users> getAllUsers(){
		List<Users> userList=userService.getAllUser();
		return userList;
	}
	
	@PostMapping("/create")
	public Users create(@RequestBody Users user){
		logger.info("hello");
		System.out.println("user"+user);
		Users userObj=userService.create(user);
		System.out.println("user:::::::::::"+user);
		return user;
	}
	
	@PostMapping("/user/{name}")
	@ResponseBody
	public Users create(@PathVariable("name") String name){
		
		Users userObj=userService.findByName(name);
		
		return userObj;
		
	}
}
