package bms.system.Models;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="city")
public class City extends BaseModel {

    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theater> theaters=new ArrayList<>();

    public City(Long id, Date createdAt, Date updatedAt,String name)
    {
        super(id,createdAt,updatedAt);
        this.name=name;
    }
}
