package kg.Alessand.Task.controller;


import io.swagger.annotations.Api;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.model.dto.ParkHistoryDto;
import kg.Alessand.Task.service.ParkHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static kg.Alessand.Task.config.Swagger2Config.PARKHISTORY;

@Api(tags = PARKHISTORY)
@RestController
@RequestMapping(value = "/ParkHistorys")
public class ParkHistoryController {
    @Autowired
    ParkHistoryService parkHistoryService;

    @GetMapping("/getAllHistory")
    List<ParkHistory> findAll(){
        return parkHistoryService.findAll();
    }

    @PutMapping("/saveHistory")
    ParkHistoryDto save(ParkHistoryDto parkHistoryDto){
        return parkHistoryService.save(parkHistoryDto);
    }

    @GetMapping("/findByIdHistory")
    Optional<ParkHistory> findByid(Long id){
        return parkHistoryService.findById(id);
    }
}
