package kg.Alessand.Task.controller;

import io.swagger.annotations.Api;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static kg.Alessand.Task.config.Swagger2Config.CAR;

@Api(tags = CAR)
@RestController
@RequestMapping(value = "/Car")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/findAll")
    private List<?> findAll(){
        return carService.findAll();
    }
    @GetMapping("/findCarNumber")
    private List<?> findCarNumber(@RequestParam String ss){
        return carService.findCarOnNumber(ss);
    }
    @GetMapping("/findCarById")
    private Optional<Car> findCarById(Long id){
        return carService.findCarById(id);
    }
}
