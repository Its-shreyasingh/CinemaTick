package bms.system.DTOs;
import java.util.*;


import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import lombok.Data;

@Data
public class CreateMovieRequest {
    private String name;
    private Integer duration;
    private Double rating;
    private List<Language> languages;
    private List<MovieFeature> features;
}
