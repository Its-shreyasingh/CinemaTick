package bms.system.Models;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    private Long id;

    public User(String name,String email,String password,Long id)
    {
        this.name=name;
        this.email=email;
        this.password=password;
        this.id=id;
    }
}
