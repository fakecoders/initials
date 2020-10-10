package com.fakecoders.initials.userMgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fakecoders.initials.userMgmt.model.Users;
import com.fakecoders.initials.userMgmt.rest.UserRest;
import com.fakecoders.initials.userMgmt.dao.IUsersDao;

@Component
public class UsersServiceImpl implements IUsersService{
	
	@Autowired
	IUsersDao usersDao;
	
	public void setDao(IUsersDao dao) {
		usersDao=dao;
	}

	@Override
	public List<Users> getAllUser() {
		List<Users> userList=usersDao.findAll();
		return userList;
	}

	@Override
	public Users create(Users user) {
		System.out.println("user service"+user);
		// TODO Auto-generated method stub
		return usersDao.save(user);
	}

	@Override
	public Users findByName(String name) {
		// TODO Auto-generated method stub
		return usersDao.findByFirstName(name);
	}
	
	

}
