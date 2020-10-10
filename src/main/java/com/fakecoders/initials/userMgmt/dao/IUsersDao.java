package com.fakecoders.initials.userMgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fakecoders.initials.userMgmt.model.Users;

@Repository
public interface IUsersDao extends JpaRepository<Users, Integer>{
	Users findByFirstName(String firstName);
}
