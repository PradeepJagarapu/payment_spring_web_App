package com.pradeep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.entity.UserEntity;
import com.pradeep.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userDAO;
	
	public List<UserEntity> getAllUsers(){
		List<UserEntity> users=userDAO.findAll();
		return users;
	}
	
	public UserEntity getUserById(int userId) {
		Optional<UserEntity> user = userDAO.findById(userId);
		return user.get();
	}
}
