package com.practice.Services;

import java.util.List;

import com.practice.Entity.User;



public interface UserServices {
	
	
	//Create
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get Single User of given userId
	User getUser(String userId);
	
	
	//Todo: delete, update
	

}
