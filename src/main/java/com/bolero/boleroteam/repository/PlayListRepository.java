package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.PlayList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayListRepository extends CrudRepository<PlayList, Long> {
}
