package bms.system.Models;

import bms.system.Enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import java.util.Date;

@Getter
@Entity
public class ShowSeat extends BaseModel {

    private Double price;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;
    
    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    public ShowSeat(Long id, Date createdAt, Date updatedAt,Double price, SeatStatus status,Seat seat)
    {
    super(id,createdAt,updatedAt);
    this.price=price;
    this.status=status;
    this.seat=seat;
}
}
