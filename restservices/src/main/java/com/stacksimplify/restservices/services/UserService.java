package com.stacksimplify.restservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepositorty;
	
	public List<User> getAllUsers(){
		
		return userRepositorty.findAll();
	}
	
	public User getUserByUserName(String username) {
		return userRepositorty.findByUserName(username);
	}

}
