package com.sms.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.sms.models.User;
@Service
public interface UserService {
	
	User adduser(User u);
	User getById(int id);
	User getByEmail(String email);
	User getByUserName(String username);
	public List<User> getAllUsers();
	User checkuser(String email,String passwrod);
	int updateUserPass(String email, String password);
	

}
