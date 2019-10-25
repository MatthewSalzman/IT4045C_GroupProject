package com.quickpass.service;

import org.springframework.stereotype.Component;

import com.quickpass.dto.UserDTO;

@Component
public class UserServiceStub implements IUserService {

	@Override
	public UserDTO fetchById(int id) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setFirstName("John");
		userDTO.setLastName("Doe");
		return userDTO;
	}
	
	@Override
	public void save(UserDTO userDTO) {
		
	}
}
