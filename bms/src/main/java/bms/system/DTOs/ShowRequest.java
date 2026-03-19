package bms.system.DTOs;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ShowRequest {
    private Long movieId;
    private Long hallId;
    private LocalDateTime startTime;
    private double amount;
}
