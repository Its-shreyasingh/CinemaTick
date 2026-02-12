package bms.system.Models;

import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import java.util.*;

@Getter
@Entity
public class Movie extends BaseModel{
    
    private String name;
    private Integer duration;
    private Double rating;
    @Enumerated
    @ElementCollection
    private List<Language> languages=new ArrayList<>();
    @Enumerated
    @ElementCollection
    private List<MovieFeature> features=new ArrayList<>();

    public Movie(Long id,Date createdAt,Date updatedAt,String name,Integer duration,Double rating,List<Language> languages,List<MovieFeature> features)
    {
        super(id,createdAt,updatedAt);
        this.name=name;
        this.duration=duration;
        this.rating=rating;
        this.languages=languages;
        this.features=features;
    }
}
