package com.quickpass.service;

import com.quickpass.dto.PasswordDTO;


/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */

public interface IPasswordStub {

	/**
	 * Get specimens from persistence layer.
	 * @param id a unique lookup
	 *@return a specimen with a matching ID.
	 */

	PasswordDTO fetchById(int id);

	

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(PasswordDTO passwordDTO);


}

