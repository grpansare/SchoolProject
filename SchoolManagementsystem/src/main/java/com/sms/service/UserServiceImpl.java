package com.sms.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.models.User;
import com.sms.dao.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepo ur;
	@Override
	public User adduser(User u) {
		return ur.save(u);

	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByUserName(String username) {
		// TODO Auto-generated method stub
		return ur.findByUsername(username);
	}
	public List<User> getAllUsers(){
		return ur.findAll();
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return ur.findByEmail(email);
	}
	@Override
	public User checkuser(String email,String passwrod) {
		return ur.checkUser(email, passwrod);
	}

	@Override
	public int updateUserPass(String email, String password) {
		// TODO Auto-generated method stub
		User u=ur.findByEmail(email);
		if(u!=null) {
			u.setPassword(password);
			ur.save(u);
			return 1;
		}
		return 0;
	}

}
