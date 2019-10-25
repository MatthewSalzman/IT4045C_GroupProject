package com.quickpass.service;

import com.quickpass.dto.UserDTO;


/**
 * CRUD operations for users
 * @author Administrator
 *
 */

public interface IUserStub {

	/**
	 * Get users from persistence layer.
	 * @param id a unique lookup
	 *@return a user with a matching ID.
	 */

	UserDTO fetchById(int id);

	

	/**
	 * Persist the given DTO
	 * @param userDTO
	 *
	 */

	void save(UserDTO userDTO);


}
