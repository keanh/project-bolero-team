package com.bolero.boleroteam.Controller;

import com.bolero.boleroteam.model.Style;
import com.bolero.boleroteam.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StyleController {
    @Autowired
    StyleService styleService;

    @GetMapping("/styles")
    public ResponseEntity<List<Style>> findAll(){
        List<Style> styleList =(List<Style>) styleService.findAll();
        return new ResponseEntity<>(styleList, HttpStatus.OK);

    }
}
