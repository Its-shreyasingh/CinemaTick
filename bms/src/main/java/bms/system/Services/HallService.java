package bms.system.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import bms.system.Models.Hall;
import bms.system.DTOs.CreateHallRequest;
import bms.system.Repositories.HallRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HallService {
    private HallRepository hallRepository;
    public Hall addHall(CreateHallRequest request)
    {
        Hall hall=Hall.builder()
        .hallNumber(request.getHallNumber())
        .seats(request.getSeats() != null ? request.getSeats() : new ArrayList<>())
        .features(request.getFeatures() != null ? request.getFeatures() : new ArrayList<>())
        .build();

        return hallRepository.save(hall);
    }
    public Hall getHallId(Long id)
    {
        return hallRepository.findById(id).orElseThrow(()->new HallNotFoundException("Hall is found by this id:"+id));
    }
    public class HallNotFoundException extends RuntimeException
    {
        public HallNotFoundException(String message)
        {
            super(message);
        }
    }
}
