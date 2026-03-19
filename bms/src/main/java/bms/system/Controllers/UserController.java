package bms.system.Controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bms.system.DTOs.CreateUserRequest;
import bms.system.DTOs.GetUserResponse;
import bms.system.Models.User;
import bms.system.Services.UserService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1") //helps map the path to method
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @RequestMapping(path = "/user",method=RequestMethod.POST)
    public GetUserResponse createUser(@RequestBody CreateUserRequest request)
    {
        User user=userService.createUser(request.toUser());
        return GetUserResponse.fromUser(user);
    }
}

//Create a user -> POST/api/v1/user
//Fetch a user -> GET/api/v1/user

//User-> id=1
//Constructor injection ->new User(1)  [immutable]
//Setter injection ->new User; user.setId(1)
//Field injection ->new User();user.id=1