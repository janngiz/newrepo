package com.example.repository;

import java.util.List;



public interface CustomUserService {
	

	public CustomUser saveUser(CustomUser user);

	public CustomUser getUserById(Integer id);

	public List<CustomUser> getAllUser();

	public void deleteUserById(Integer id);

	public CustomUser updateUserById(Integer id, CustomUser user);


}
