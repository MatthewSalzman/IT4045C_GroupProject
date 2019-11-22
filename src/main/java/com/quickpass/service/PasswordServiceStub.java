package com.quickpass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quickpass.dao.IPasswordDAO;
import com.quickpass.dto.PasswordDTO;

@Component
public class PasswordServiceStub implements IPasswordService {

	// Add user ADO here?
	
	
	@Autowired
	IPasswordDAO passwordDAO;
	
	
	@Override
	public PasswordDTO fetchById(int id) {
		PasswordDTO passwordDTO = new PasswordDTO();
		passwordDTO.setPasswordId(1);
		passwordDTO.setUserId(1);
		passwordDTO.setPassword("Pa$$w0rd");
		return passwordDTO;
	}
	
	@Override
	public boolean save(PasswordDTO passwordDTO) throws Exception {
		passwordDAO.save(passwordDTO);
		return false;
		
	}
}
