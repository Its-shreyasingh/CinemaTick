package bms.system.DTOs;

import lombok.Data;

@Data
public class MovieResponse {
    private Long id;
    private String name;
    private String genre;
    private int duration;
}
