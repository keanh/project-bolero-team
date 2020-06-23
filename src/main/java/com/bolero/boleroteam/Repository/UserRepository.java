package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
