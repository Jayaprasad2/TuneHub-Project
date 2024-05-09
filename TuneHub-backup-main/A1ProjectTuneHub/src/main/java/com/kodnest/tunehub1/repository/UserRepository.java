package com.kodnest.tunehub1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub1.entity.User;

public interface UserRepository 
extends JpaRepository<User, String>{

	public User findByEmail(String email);

}
