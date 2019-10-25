package com.quickpass.service;

import com.quickpass.dto.PasswordDTO;


/**
 * CRUD operations for passwords
 * @author Administrator
 *
 */

public interface IPasswordStub {

	/**
	 * Get passwords from persistence layer.
	 * @param id a unique lookup
	 *@return a password with a matching ID.
	 */

	PasswordDTO fetchById(int id);

	

	/**
	 * Persist the given DTO
	 * @param passwordDTO
	 *
	 */

	void save(PasswordDTO passwordDTO);


}
