package bms.system.Models;

import java.util.ArrayList;
import java.util.*;

import bms.system.Enums.TicketStatus;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class Ticket extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> seats=new ArrayList<>();

    private Double amount;
    private TicketStatus status;
    private List<Payment> payment=new ArrayList<>();

    public Ticket(Long id,Date createdAt,Date updatedAt,Show show,User user,List<ShowSeat> seats,Double amount,TicketStatus status,List<Payment> payment)
    {
        super(id,createdAt,updatedAt);
        this.show=show;
        this.user=user;
        this.seats=seats;
        this.amount=amount;
        this.status=status;
        this.payment=payment;
    }
}
