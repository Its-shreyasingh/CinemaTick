package bms.system.Models;

import bms.system.Enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "seats")
public class Seat extends BaseModel {
    
    private  Integer rowNumber;
    private  Integer columnNumber;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
    @Enumerated(EnumType.STRING)
    private  SeatType type;


}
