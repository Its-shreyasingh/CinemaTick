package bms.system.Models;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;

    private Date startTime;
    private Integer duration;

    @ManyToOne
    @JoinColumn(name ="theater_id")
    private Theater theater;

    private List<ShowSeat> showSeats =new ArrayList<>();
}
