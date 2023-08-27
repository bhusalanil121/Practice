package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);
	

}
