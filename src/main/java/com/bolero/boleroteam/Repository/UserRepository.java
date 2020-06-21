package com.bolero.boleroteam.Repository;

import com.bolero.boleroteam.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
