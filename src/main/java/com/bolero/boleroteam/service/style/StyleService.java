package com.bolero.boleroteam.service.style;

import com.bolero.boleroteam.model.Style;

public interface StyleService  {
    Iterable<Style> findAll();

    void save(Style style);

    void delete(Long id);

    Style findById(Long id);
}
