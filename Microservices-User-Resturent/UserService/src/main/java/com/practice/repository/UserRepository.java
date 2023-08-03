package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	

}
