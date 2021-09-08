package kg.Alessand.Task.controller;

import io.swagger.annotations.Api;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.service.ParkHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import static kg.Alessand.Task.config.Swagger2Config.PARKHISTORY;

@Api(tags = PARKHISTORY)
@RestController
@RequestMapping(value = "/ParkHistory")
public class ParkingHistoryController {
    @Autowired
    private ParkHistoryService parkHistoryService;
    @GetMapping("/findAll")
    private List<ParkHistory> findAll(){
        return parkHistoryService.findAll();
    }
    @GetMapping("/findById")
    private Optional<ParkHistory> findById(@RequestParam Long id){
        return parkHistoryService.findParkingStroke(id);
    }
    @GetMapping("/findByDate")
    private List<ParkHistory> findByDate(@RequestParam Date date){
        return parkHistoryService.findCarsInDate(date);
    }

}
