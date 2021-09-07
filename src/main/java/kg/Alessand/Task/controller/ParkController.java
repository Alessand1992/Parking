package kg.Alessand.Task.controller;


import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static kg.Alessand.Task.config.Swagger2Config.PARK;

@Api(tags = PARK)
@RestController
@RequestMapping(value = "/Park")
public class ParkController {
    @Autowired
    ParkService parkService;
//    @PostMapping("/save")
//    private ParkDto save(@ModelAttribute ParkDto parkDto){
//        return parkService.comeIn(parkDto);
//    }
    //@PostMapping("/save")
    //private ClientsDto save(@ModelAttribute ClientsDto clientsDto) {
    //    return clientsService.save(clientsDto);
    @PutMapping("/setFree")
    private Integer updateStatus(@RequestParam Long id){
        return parkService.setFreeParking(id);
    }
    @GetMapping("/findAll")
    private List<Park> findAll(){
        return parkService.findAll();
    }
    @PostMapping("/save")
    private Park save(@ModelAttribute Park park){
        return parkService.comeInn(park);
    }
    @GetMapping("/findFreePlace")
    private long findFreePlace(){
        return parkService.findFreePlace();
    }


}
