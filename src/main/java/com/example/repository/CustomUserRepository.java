package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomUserRepository extends JpaRepository<CustomUser,Integer> {
	
	public CustomUser findByFirstName(String username);

}
