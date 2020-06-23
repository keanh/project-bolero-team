package com.bolero.boleroteam.controller;

import com.bolero.boleroteam.model.User;
import com.bolero.boleroteam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserRestController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "user/create",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createUser(@RequestBody User user){
        userService.save(user);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping(value = "user")
    public ResponseEntity<List<User>> listUsers(){
        List<User> users;
        users = userService.findAll();
        if (users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<List<User>>(users,HttpStatus.OK);
        }
    }

    @GetMapping(value = "user/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id){
        Optional<User> user = userService.findById(id);
        User user1 = user.get();
        if (user1 == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<User>(user1,HttpStatus.OK);
        }
    }

    @PutMapping("user/info/{id}")
    public ResponseEntity<User> updateInfoUser(@PathVariable Long id,@RequestBody User user){
        Optional<User> user1 = userService.findById(id);
        User user2 = user1.get();
        if (user2 == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else {
            user2.setFirstName(user.getFirstName());
            user2.setLastName(user.getLastName());            user2.setAvatar(user.getAvatar());
            user2.setAvatar(user.getAvatar());
            user2.setBirthday(user.getBirthday());
            user2.setAddress(user.getAddress());
            user2.setPhone(user.getPhone());
            user2.setEmail(user.getEmail());
            userService.save(user2);
            return new ResponseEntity<User>(user2,HttpStatus.OK);
        }
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        Optional<User> user = userService.findById(id);
        if (user == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else {
            userService.remove(id);
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("user/{id}")
    public ResponseEntity<User> updatePassword(@PathVariable Long id,@RequestBody User user){
        Optional<User> user1 = userService.findById(id);
        User user2 = user1.get();
        if (user2 == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else {
            user2.setPassword(user.getPassword());
            userService.save(user2);
            return new ResponseEntity<User>(user2,HttpStatus.OK);
        }
    }
}
