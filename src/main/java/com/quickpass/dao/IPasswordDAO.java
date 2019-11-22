package com.quickpass.dao;
import com.quickpass.dto.PasswordDTO;

public interface IPasswordDAO {
	boolean save(PasswordDTO passwordDTO) throws Exception;
	
}
