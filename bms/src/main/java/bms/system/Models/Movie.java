package bms.system.Models;

import bms.system.Enums.Language;
import bms.system.Enums.MovieFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
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


}
