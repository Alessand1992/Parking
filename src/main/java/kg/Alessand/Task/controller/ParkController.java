package kg.Alessand.Task.controller;


import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static kg.Alessand.Task.config.Swagger2Config.PARK;

@Api(tags = PARK)
@RestController
@RequestMapping(value = "/Park")
public class ParkController {
    @Autowired
    private ParkService parkService;

    @GetMapping("/findallPark")
    private List<Park> findAll(){
        return parkService.findAll();
    }
    @GetMapping("/findById")
    private Optional<Park> byId(Long id){
        return parkService.findById(id);
    }
    @PutMapping("/savePark")
    private ParkDto save(ParkDto parkDto){
        return parkService.saveOrUpdate(parkDto);
    }
    @PutMapping("/changeStatus")
    private String change(Long id){
        return parkService.setFree(id);
    }
    @GetMapping("/placeStatus")
    private int place(){
        return parkService.findAllFreePlace();
    }


}
