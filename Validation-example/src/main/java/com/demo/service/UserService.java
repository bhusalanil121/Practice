package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.User;
import com.demo.dto.UserRequest;
import com.demo.exception.UserNotFoundException;
import com.demo.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
		return userRepo.save(user);

	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User getUser(int id) throws UserNotFoundException {
		User user = userRepo.findByUserId(id);
		if(user != null) {
			return user;
		}else {
			throw new UserNotFoundException("User not found with id : "+ id);
		}
		

	}

}
