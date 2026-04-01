package bms.system.Services;

import java.util.*;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bms.system.DTOs.CreateShowRequest;
import bms.system.Models.Show;
import bms.system.Models.Movie;
import bms.system.Models.Hall;
import bms.system.Repositories.MovieRepository;
import bms.system.Repositories.ShowRepository;
import bms.system.Repositories.HallRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ShowService {
    private ShowRepository showRepository;
    private MovieRepository movieRepository;
    private HallRepository hallRepository;
    public Show createShow(CreateShowRequest request)
    {
        Movie movie=movieRepository.findById(request.getMovieId()).orElseThrow(()->new RuntimeException("Movie not found"));
        Hall hall=hallRepository.findById(request.getHallId()).orElseThrow(()->new RuntimeException("Hall not found"));
        Show show=Show.builder()
        .startTime(request.getStartTime())
        .duration(request.getDuration())
        .movie(null)
        .showSeats(Collections.emptyList()).build();
        return showRepository.save(show);
    }

    public Show getShow(Long id)
    {
        return showRepository
        .findById(id)
        .orElseThrow(()->new NoSuchElementException("Invalid show id:"+id));
    }
}
