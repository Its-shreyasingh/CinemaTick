package bms.system.Models;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User extends BaseModel {
    private String name;
    private String email;

    public User(Long id,Date createdAt,Date updatedAt,String email)
    {
        super(id,createdAt,updatedAt);
        this.email=email;
    }
}
