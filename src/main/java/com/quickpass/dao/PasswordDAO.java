package com.quickpass.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quickpass.dto.PasswordDTO;

@Component
public class PasswordDAO implements IPasswordDAO {

	
	@Autowired
	PasswordRepository passwordRepository;
	
	@Override
	public boolean save(PasswordDTO passwordDTO) throws Exception {
		// TODO Auto-generated method stub
		passwordRepository.save(passwordDTO);
		return false;
	}

}
