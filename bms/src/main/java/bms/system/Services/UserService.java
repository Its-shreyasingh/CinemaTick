package bms.system.Services;

import org.springframework.stereotype.Service;

import bms.system.Models.User;

@Service
public class UserService {

    public User createUser(User user)
    {
        System.out.println("Got request for in service:" +user.getEmail() +" with pwd:" +user.getPassword());
        return new User();
    }
}
