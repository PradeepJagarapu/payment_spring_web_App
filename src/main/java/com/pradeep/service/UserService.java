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
	
	public boolean registerUser(UserEntity user){
			
		UserEntity savedUser= userDAO.save(user); 
		
		if(savedUser!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public UserEntity validateUser(String username,String password) {
		
		//existingUSer - if the user exists in the db or not
		Optional<UserEntity> existingUser=userDAO.findByUserNameAndPassword(username, password);
		
		if(existingUser.isPresent()) {
			return existingUser.get();
		}else {
			return null;
		}
		
	}
}
