package com.quickpass.dao;

import org.springframework.data.repository.CrudRepository;
import com.quickpass.dto.PasswordDTO;
public interface PasswordRepository extends CrudRepository<PasswordDTO, Integer> {

}
