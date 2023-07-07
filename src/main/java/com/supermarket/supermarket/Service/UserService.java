package com.supermarket.supermarket.Service;


import com.supermarket.supermarket.Repository.UserRepo;
import com.supermarket.supermarket.model.Customer;
import com.supermarket.supermarket.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

//    public static User Updateuser(User user) {
//        return UserRepo.findAll();
//    }


    public static void deleteUser(Long userID) {
    }

    public static User Updateuser(User user) {
        return null;
    }


    public User createuser(User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
