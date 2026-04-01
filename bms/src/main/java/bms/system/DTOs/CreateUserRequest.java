package bms.system.DTOs;

import bms.system.Models.User;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
    private Long id;

    public User toUser()
    {
        return new User(name, email, password,id);
    }
}
