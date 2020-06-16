package com.bolero.boleroteam.service.style;

import com.bolero.boleroteam.model.Style;
import com.bolero.boleroteam.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleServiceImpl implements StyleService {
    @Autowired
    private StyleRepository styleRepository;
    @Override
    public Iterable<Style> findAll() {
        return styleRepository.findAll();
    }

    @Override
    public void save(Style style) {
         styleRepository.save(style);

    }

    @Override
    public void delete(Long id) {
        styleRepository.deleteById(id);

    }

    @Override
    public Style findById(Long id) {
        return styleRepository.findById(id).get();
    }
}
