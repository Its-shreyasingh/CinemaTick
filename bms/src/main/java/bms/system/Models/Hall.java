package bms.system.Models;

import java.util.*;

import bms.system.Enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Hall extends BaseModel {

    private Integer hallNumber;

    @Builder.Default
    @OneToMany(mappedBy = "hall")
    private List<Seat> seats=new ArrayList<>();

    @Enumerated
    @ElementCollection
    private List<MovieFeature> features=new ArrayList<>();
    @ManyToOne

    @JoinColumn(name="theater_id")
    private Theater theater;

    public Hall(Long id,Date createdAt,Date updatedAt,Integer hallNumber)
    {
        super(id,createdAt,updatedAt);
        this.hallNumber=hallNumber;
    }
}
