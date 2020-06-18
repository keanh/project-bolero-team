package com.bolero.boleroteam.service.impl;

import com.bolero.boleroteam.Repository.StyleRepository;
import com.bolero.boleroteam.model.Style;
import com.bolero.boleroteam.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StyleServiceImpl implements StyleService {
    @Autowired
    private StyleRepository styleRepository;

    @Override
    public List<Style> findAll() {
        return null;
    }

    @Override
    public Optional<Style> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Style style) {
        styleRepository.save(style);
    }

    @Override
    public void remove(Long id) {

    }
}
