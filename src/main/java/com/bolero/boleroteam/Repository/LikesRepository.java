package com.bolero.boleroteam.Repository;

import com.bolero.boleroteam.model.Likes;
import com.bolero.boleroteam.model.Song;
import org.springframework.data.relational.core.sql.Like;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LikesRepository extends CrudRepository<Likes, Long> {
    List<Likes> findAllById(Long id);
}
