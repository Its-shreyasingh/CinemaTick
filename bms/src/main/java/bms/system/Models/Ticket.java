package bms.system.Models;

import java.util.*;

import bms.system.Enums.TicketStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ticket extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="show_id")
    private Show show;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany
    private List<ShowSeat> seats=new ArrayList<>();

    private Double amount;
    private TicketStatus status;

    @OneToMany(mappedBy="ticket",cascade = CascadeType.ALL)
    private List<Payment> payment=new ArrayList<>();

}
