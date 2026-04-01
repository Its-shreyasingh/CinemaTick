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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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


}
