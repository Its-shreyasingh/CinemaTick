package bms.system.Models;

import bms.system.Enums.PaymentMode;
import bms.system.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.*;
import lombok.Getter;

@Getter
@Entity
public class Payment extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private  String referenceID;
    private  Double amount;
    @Enumerated
    private  PaymentMode mode;
    @Enumerated
    private  PaymentStatus status;
    @ManyToOne
    @JoinColumn(name="ticket_id")
    private Ticket ticket;

}
