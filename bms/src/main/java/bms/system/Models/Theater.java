package bms.system.Models;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="theaters")
public class Theater extends BaseModel {
    private String name;
    private String address;
    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;
    @ElementCollection
    @OneToMany(mappedBy = "theater")
    private List<Hall> halls=new ArrayList<>();

    @OneToMany
    private List<Show> shows=new ArrayList<>();

    public Theater(Long id,Date createdAt,Date updatedAt,String name,String address,List<Hall> halls,List<Show> shows)
    {
        super(id,createdAt,updatedAt);
        this.name=name;
        this.address=address;
        this.halls=halls;
        this.shows=shows;
    }
}
