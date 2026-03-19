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

}
