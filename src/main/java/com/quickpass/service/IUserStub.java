package com.quickpass.service;

import com.quickpass.dto.UserDTO;


/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */

public interface IUserStub {

	/**
	 * Get specimens from persistence layer.
	 * @param id a unique lookup
	 *@return a specimen with a matching ID.
	 */

	UserDTO fetchById(int id);

	

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(UserDTO userDTO);


}