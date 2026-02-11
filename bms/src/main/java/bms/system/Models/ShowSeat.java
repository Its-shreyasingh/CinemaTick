package bms.system.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name ="SHOW_SEATS")
public class ShowSeat {

    @ManyToOne
    private HallSeat hallSeat;

    @ManyToOne
    private Booking booking;
    private boolean occupied;

    @ManyToOne
    private Show show;
}
