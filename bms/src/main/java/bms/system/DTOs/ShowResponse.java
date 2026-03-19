package bms.system.DTOs;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ShowResponse {
    private Long id;
    private LocalDateTime startTime;
    private String movieTitle;
    private String theaterName;
    private String hallNumber;
}
