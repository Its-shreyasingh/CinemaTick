package bms.system.Controllers;
import bms.system.DTOs.CreateMovieRequest;
import bms.system.Models.Movie;
import lombok.AllArgsConstructor;
import bms.system.Services.MovieService;
import org.springframework.web.bind.annotation.*;



@RestController
@AllArgsConstructor
public class MovieController {
    private final MovieService movieService;
    @GetMapping("/movie/{id}")
    public Movie getMovie (@PathVariable Long id)
    {
        return movieService.getMovieById(id);
    }
    @PostMapping("/show")
    public Movie addMovie(@RequestBody CreateMovieRequest request)
    {
        return movieService.addMovie(request);
    }
    
}
