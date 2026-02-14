package bms.system.Models;

import bms.system.Enums.PaymentMode;
import bms.system.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.*;
import lombok.Getter;

@Getter
@Entity
public class Payment extends BaseModel {

    private final String referenceID;
    private final Double amount;
    @Enumerated
    private final PaymentMode mode;
    @Enumerated
    private final PaymentStatus status;
    @ManyToOne
    @JoinColumn(name="ticket_id")
    private Ticket ticket;


    public Payment(Long id,Date createdAt,Date updatedAt,String referenceId,Double amount,PaymentMode mode,PaymentStatus status,Ticket ticket)
    {
        super(id, createdAt, updatedAt);
        this.referenceID=referenceId;
        this.amount=amount;
        this.mode=mode;
        this.status=status;
        this.ticket=ticket;
    }
}
