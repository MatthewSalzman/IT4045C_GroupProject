package com.quickpass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quickpass.dao.IUserDAO;
import com.quickpass.dto.UserDTO;

@Component
public class UserServiceStub implements IUserService {

	@Autowired
	IUserDAO userDAO;
	
	
	@Override
	public UserDTO fetchById(int id) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setFirstName("John");
		userDTO.setLastName("Doe");
		return userDTO;
	}
	
	@Override
	public boolean save(UserDTO userDTO) throws Exception {
		userDAO.save(userDTO);
		
		return false;
	}
}
