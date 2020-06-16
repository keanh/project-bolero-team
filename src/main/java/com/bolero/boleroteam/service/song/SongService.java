package com.bolero.boleroteam.service.song;

import com.bolero.boleroteam.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SongService {
    Page<Song> findAll(Pageable pageable);

    void save(Song song);

    void delete(Long id);

    Song findById(Long id);
}
