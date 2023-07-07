package com.supermarket.supermarket.Controller;

import com.supermarket.supermarket.Service.UserService;
import com.supermarket.supermarket.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    private ResponseEntity<User> createUser(@RequestBody User user){
        User insert= userService.createuser(user);
        return new ResponseEntity<>(insert, HttpStatus.OK);
    }
    @GetMapping("/user")
    private List<User> getAll(){

        return userService.getAllUser();
    }
    @DeleteMapping("/user/{userID}")
    public ResponseEntity<String> deleteUser(@PathVariable("userID") Long userID){
        UserService.deleteUser(userID);
        return new ResponseEntity<String>("Successfully deleted",HttpStatus.OK);
        }
        @PutMapping("/user/{id}")
        public ResponseEntity<User> updateStudent(@PathVariable("userID") long userID,@RequestBody User user){
        user.setUserID(userID);
        User updateUser= UserService.Updateuser(user);
            return new ResponseEntity<>(updateUser, HttpStatus.OK);
        }
}
