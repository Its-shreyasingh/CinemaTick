package bms.system.Models;

import bms.system.Enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import java.util.*;

@Getter
@Entity
public class Seat extends BaseModel {
    
    private final Integer row;
    private final Integer column;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
    @Enumerated(EnumType.STRING)
    private final SeatType type;

    public Seat(Long id,Date createdAt,Date updatedAt,Integer row,Integer column,SeatType type,Hall hall)
    {
        super(id,createdAt,updatedAt);
        this.row=row;
        this.column=column;
        this.type=type;
        this.hall=hall;
    }
}
