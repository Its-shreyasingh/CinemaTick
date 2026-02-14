package bms.system.Models;
import java.util.*;

import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
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

    public Show(Long id,Date createdAt,Date updatedAt,Movie movie,Language language,Date startTime,Date endTime,Hall hall,List<MovieFeature> movieFeatures,List<ShowSeat> showSeats)
    {
        super(id,createdAt,updatedAt);
        this.movie=movie;
        this.language=language;
        this.startTime=startTime;
        this.endTime=endTime;
        this.hall=hall;
        this.movieFeatures=movieFeatures;
        this.showSeats=showSeats;
    }
}
