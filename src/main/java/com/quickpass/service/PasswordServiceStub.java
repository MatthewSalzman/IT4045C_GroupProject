package com.quickpass.service;

import org.springframework.stereotype.Component;

import com.quickpass.dto.PasswordDTO;

@Component
public class PasswordServiceStub implements IPasswordService {

	@Override
	public PasswordDTO fetchById(int id) {
		PasswordDTO passwordDTO = new PasswordDTO();
		passwordDTO.setPasswordId(1);
		passwordDTO.setUserId("Carlos");
		passwordDTO.setPassword("Pa$$w0rd");
		return passwordDTO;
	}
	
	@Override
	public void save(PasswordDTO passwordDTO) {
		
	}
}
