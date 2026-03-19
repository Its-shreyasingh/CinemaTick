package bms.system.Models;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

}
