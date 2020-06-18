package com.bolero.boleroteam.service;

import com.bolero.boleroteam.model.Song;
import com.bolero.boleroteam.model.Style;

import java.util.List;
import java.util.Optional;

public interface SongService {
    List<Song> findAll();
    Optional<Song> findById(Long id);
    void save(Song song);
    void remove(Long id);
}
