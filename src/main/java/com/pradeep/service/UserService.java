package com.pradeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pradeep.entity.UserEntity;
import com.pradeep.repository.UserRepository;

public class UserService {
	
	@Autowired
	UserRepository userDAO;
	
	public List<UserEntity> getAllUsers(){
		List<UserEntity> users=userDAO.findAll();
		return users;
	}
}
