package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.Likes;
import com.bolero.boleroteam.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {
    List<Song> findByLyricsContaining(String lyrics);
    List<Song> findByNameContaining(String lyrics);
    List<Song> findTop3ByOrderByDateSubmittedDesc();
    List<Likes> findAllByUserId(Long id);
}
