package com.bolero.boleroteam.controller;

import com.bolero.boleroteam.model.Style;
import com.bolero.boleroteam.service.StyleService;
import com.bolero.boleroteam.service.impl.FirebaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class StyleRestController {
    @Autowired
    private StyleService styleService;

    @Autowired
    FirebaseServiceImpl firebaseService;

    @PostMapping("/createStyle")
    public String create(@RequestBody Style style) throws ExecutionException, InterruptedException {
        styleService.save(style);
        return firebaseService.saveStyle(style);
    }
}
