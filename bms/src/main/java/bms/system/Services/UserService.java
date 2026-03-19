package bms.system.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bms.system.Models.User;
import bms.system.Repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user)
    {
        System.out.println("Got request for in service:" +user.getEmail() +" with pwd:" +user.getPassword());
        return userRepository.save(user);
    }
}
