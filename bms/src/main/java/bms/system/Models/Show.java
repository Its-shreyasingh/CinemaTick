package bms.system.Models;
import java.util.*;

import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="shows")
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;

    private Language language;
    private Date startTime;
    private Date endTime;
    private Integer duration;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    @Builder.Default
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures=new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats=new ArrayList<>();


}
