package kg.Alessand.Task.controller;


import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static kg.Alessand.Task.config.Swagger2Config.PARK;

@Api(tags = PARK)
@RestController
@RequestMapping(value = "/Park")
public class ParkController {
    @Autowired
    private ParkService parkService;

    @PutMapping("/setFree")
    private Integer updateStatus(@RequestParam Long id){
        return parkService.setFreeParking(id);
    }
    @PutMapping("/setIn")
    private Integer updateStatus1(@RequestParam Long id){
        return parkService.setFreeParking(id);
    }
    @GetMapping("/findAll")
    private List<?> findAll(){
        return parkService.findAll();
    }
    @GetMapping("/findAllCarsOnPark")
    private Stream<Park> findAllCarsOnPark(){
        return parkService.findAllCarsOnParkNow();
    }
    @PostMapping("/save")
    private ParkDto save(@ModelAttribute ParkDto parkDto){
        return parkService.comeInn(parkDto);
    }
    @GetMapping("/findFreePlace")
    private long findFreePlace(){
        return parkService.findFreePlace();
    }


}
