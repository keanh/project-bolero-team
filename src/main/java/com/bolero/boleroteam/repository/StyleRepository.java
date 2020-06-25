package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.Style;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends CrudRepository<Style,Long> {
}
