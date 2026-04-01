package bms.system.Models;

import java.util.ArrayList;
import java.util.*;

import bms.system.Enums.TicketStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> seats=new ArrayList<>();

    private Double amount;
    private TicketStatus status;
    @OneToMany(mappedBy="ticket")
    private List<Payment> payment=new ArrayList<>();

}
