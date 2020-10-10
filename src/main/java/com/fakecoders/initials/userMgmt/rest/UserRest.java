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
		logger.info("logger info @class UserRest @method getAllUsers");
		try {
		List<Users> userList=userService.getAllUser();
		logger.info("user{}",userList);
		return userList;
		}
		catch(Exception e) {
			logger.error("error  catch block{} @class UserRest @method getAllUsers");
			return null;
		}
		
	}
	
	@PostMapping("/create")
	public Users create(@RequestBody Users user){
		logger.info("logger info @class UserRest @method create user{}",user);
		try {
			Users userObj=userService.create(user);
			return user;
		}catch (Exception e) {
			logger.error("error  catch block{} @class UserRest @method create");
			return null;
		}
	}
	
	@PostMapping("/user/{name}")
	@ResponseBody
	public Users create(@PathVariable("name") String name){
		
		Users userObj=userService.findByName(name);
		
		return userObj;
		
	}
}
