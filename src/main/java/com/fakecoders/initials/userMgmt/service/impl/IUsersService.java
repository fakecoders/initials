package com.fakecoders.initials.userMgmt.service.impl;

import java.util.List;

import com.fakecoders.initials.userMgmt.model.Users;


public interface IUsersService {

	List<Users> getAllUser();

	Users create(Users user);

	Users findByName(String name);

}
