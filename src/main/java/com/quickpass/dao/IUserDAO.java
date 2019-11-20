package com.quickpass.dao;
import com.quickpass.dto.UserDTO;

public interface IUserDAO {
	boolean save(UserDTO userDTO) throws Exception;
}
