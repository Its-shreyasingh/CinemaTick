package bms.system.DTOs;

import bms.system.Models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetUserResponse {
    private String name;
    private String email;
    private Long id;

    public static GetUserResponse fromUser(User user)
    {
        return new GetUserResponse(user.getName(),user.getEmail(),user.getId());
    }
}
