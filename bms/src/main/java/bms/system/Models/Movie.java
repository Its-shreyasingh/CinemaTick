package bms.system.Models;

import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import java.util.*;

@Getter
@Entity
public class Movie extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer duration;
    private Double rating;
    private String genre;

    @Enumerated
    @ElementCollection
    private List<Language> languages=new ArrayList<>();

    @Enumerated
    @ElementCollection
    private List<MovieFeature> features=new ArrayList<>();


}
