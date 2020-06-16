package com.bolero.boleroteam.repository;

import com.bolero.boleroteam.model.Song;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SongRepository extends PagingAndSortingRepository<Song, Long> {
}
