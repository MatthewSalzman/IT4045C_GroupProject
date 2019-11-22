package com.quickpass.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAO implements IUserDAO {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public boolean save(com.quickpass.dto.UserDTO userDTO) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(userDTO);
		return false;
	}

}
