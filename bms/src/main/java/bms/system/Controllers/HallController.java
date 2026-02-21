package bms.system.Controllers;

import org.springframework.web.bind.annotation.RestController;
import bms.system.Models.Hall;
import bms.system.DTOs.CreateHallRequest;
import bms.system.Services.HallService;
import lombok.AllArgsConstructor;
import bms.system.Services.HallService;
import org.springframework.web.bind.annotation.*;



@RestController
@AllArgsConstructor
public class HallController {
    private HallService hallService;
    @GetMapping("/hall/{id}")
    public Hall getHall(@PathVariable Long id)
    {
        return hallService.getHallId(id);
    }
    @PostMapping("/hall")
    public Hall addHall(@RequestBody CreateHallRequest request) {
        
        
        return hallService.addHall(request);
    }
    
    
}
