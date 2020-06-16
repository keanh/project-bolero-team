package com.bolero.boleroteam.service.song;

import com.bolero.boleroteam.model.Song;
import com.bolero.boleroteam.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepository songRepository;
    @Override
    public Page<Song> findAll(Pageable pageable) {
        return songRepository.findAll(pageable);
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);

    }

    @Override
    public void delete(Long id) {
        songRepository.deleteById(id);

    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id).orElse(null);
    }
}
