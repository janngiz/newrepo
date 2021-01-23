package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomUserController {
	
	@Autowired
	CustomUserService userService;
	
	@PostMapping("/saveUser")
	public CustomUser saveUser(@RequestBody CustomUser user ) {
	 CustomUser saveUser  =	userService.saveUser(user);
		return saveUser;
	}
	
	@GetMapping("/getUserById/{id}")
	public CustomUser getUserById(@PathVariable Integer id) {
	  CustomUser user =	userService.getUserById(id);
		return user;
	}
	
	
	@GetMapping("/all")
	public List<CustomUser> getAllUser(){
		List< CustomUser> list = userService.getAllUser();
		return list;
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteUserById(@PathVariable Integer id) {
		userService.deleteUserById(id);
	}
	
	@PutMapping("/updateUserByid/{id}")
	public CustomUser updateUserById(@PathVariable Integer id, @RequestBody CustomUser user) {
		CustomUser saveUser =  userService.updateUserById(id, user);
		return saveUser;
	}


}
