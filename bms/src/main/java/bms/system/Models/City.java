package bms.system.Models;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cities")
public class City extends BaseModel {

    private String name;
    @ElementCollection
    @OneToMany(mappedBy = "city")
    private List<Theater> theaters=new ArrayList<>();


}
