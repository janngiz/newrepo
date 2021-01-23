package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class CustomUserServiceImp implements CustomUserService {
	
	 @Autowired
	  CustomUserRepository userRepo;
	 

		@Override
		public CustomUser saveUser(CustomUser user) {
			  CustomUser saveUser =  userRepo.save(user);
			return saveUser;
		}

		@Override
		public CustomUser getUserById(Integer id) {
		  CustomUser user = 	userRepo.findById(id).get();
			return user;
		}

		@Override
		public List<CustomUser> getAllUser() {
		List<CustomUser> list = 	userRepo.findAll();
			return list;
		}

		@Override
		public void deleteUserById(Integer id) {
			userRepo.deleteById(id);
		}

		@Override
		public CustomUser updateUserById(Integer id, CustomUser user) {
			user.setId(id);
			CustomUser saveUser =userRepo.save(user);
			return saveUser;
		}

}
