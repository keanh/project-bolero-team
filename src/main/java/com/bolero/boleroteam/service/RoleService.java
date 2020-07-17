package com.bolero.boleroteam.service;

import com.bolero.boleroteam.model.Likes;
import com.bolero.boleroteam.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> findAll();
    Optional<Role> findById(Long id);
    void save(Role role);
    void remove(Long id);
}
