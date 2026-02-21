package bms.system.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bms.system.DTOs.CreateShowRequest;
import org.springframework.web.bind.annotation.*;
import bms.system.Models.Show;
import bms.system.Services.ShowService;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class ShowController {

    private ShowService showService;
    //READ API for show
    @GetMapping("/show/{id}")//whenever dynamic path is created like get or put it all need dynamic id
    public Show readShow(@PathVariable Long id)//this annotation tells spring to take the id from path and inject it into the id variable
    {
        return showService.getShow(id);
    }
    //CREATE SHOW API
    @PostMapping("/show")
    public Show createShow(@RequestBody CreateShowRequest request)
    {
        return showService.createShow(request);
    }
    
}
