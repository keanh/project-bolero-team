package com.bolero.boleroteam.Repository;

import com.bolero.boleroteam.model.Song;
import com.bolero.boleroteam.model.Style;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Style> {
}
