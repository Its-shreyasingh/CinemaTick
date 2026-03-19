package bms.system.DTOs;

import java.time.LocalDateTime;
import java.util.*;
import lombok.Data;
@Data
public class TicketResponse {
    private Long ticketId;
    private String movieTitle;
    private LocalDateTime startTime;
    private String hallNumber;
    private String theaterName;
    private List<String> seatNumbers;
    private double totalAmount;
    private String status;
}
