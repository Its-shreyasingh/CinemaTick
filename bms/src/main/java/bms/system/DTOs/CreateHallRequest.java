package bms.system.DTOs;

import java.util.ArrayList;
import java.util.*;

import bms.system.Enums.MovieFeature;
import bms.system.Models.Seat;
import bms.system.Models.Theater;
import lombok.Data;

@Data
public class CreateHallRequest{
    private Integer hallNumber;
    private List<Seat> seats;
    private List<MovieFeature> features;
    private Theater theater;
}
