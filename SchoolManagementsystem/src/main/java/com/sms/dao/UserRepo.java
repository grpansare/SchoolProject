package com.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sms.models.User;
@Repository

public interface UserRepo extends JpaRepository<User, Integer>{
	User findByUsername(String username);
	User findByEmail(String email);
	
	
	@Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
	User checkUser(@Param("email") String email, @Param("password") String password);


}
