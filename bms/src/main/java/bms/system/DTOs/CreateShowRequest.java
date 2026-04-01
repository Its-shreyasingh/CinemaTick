package bms.system.DTOs;
import bms.system.Models.Show;
import lombok.Data;
import java.util.*;

@Data
public class CreateShowRequest {
    private Long movieId;
    private Long hallId;
    private Date startTime;
    private Integer duration;
}
