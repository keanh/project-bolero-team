package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style,Long> {
}
