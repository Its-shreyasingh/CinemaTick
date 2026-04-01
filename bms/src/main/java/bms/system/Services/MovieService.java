package bms.system.Services;

import org.springframework.stereotype.Service;

import bms.system.Models.Movie;
import bms.system.DTOs.CreateMovieRequest;
import bms.system.Repositories.MovieRepository;
import lombok.AllArgsConstructor;
import java.util.*;

@Service
@AllArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public Movie addMovie(CreateMovieRequest request)
    {
            Movie movie = Movie.builder()
            .name(request.getName())
            .duration(request.getDuration())
            .features(request.getFeatures() != null ? request.getFeatures() : new ArrayList<>())
            .languages(request.getLanguages() != null ? request.getLanguages() : new ArrayList<>())
            .rating(request.getRating())
            .build();

    return movieRepository.save(movie);
}

    public List<Movie> getAllMovies()
    {
        return movieRepository.findAll();
    }
    public Movie getMovieById(Long id)
    {
        return movieRepository
        .findById(id)
        .orElseThrow(()->new
        MovieNotFoundException("Movie not found by this id:"+id));
    }
    public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(String message)
    {
        super(message);
    }
        
    }
}
