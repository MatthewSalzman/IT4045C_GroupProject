package com.quickpass.dao;

import org.springframework.data.repository.CrudRepository;

import com.quickpass.dto.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, Integer> {

}
