package com.bolero.boleroteam.controller;

import com.bolero.boleroteam.model.Role;
import com.bolero.boleroteam.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("role")
    public ResponseEntity<Void> createRole(@RequestBody Role role){
        roleService.save(role);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
