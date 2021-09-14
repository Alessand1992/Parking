package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;

import java.util.List;

public interface CarService {
    List<Car> findAll();

    CarDto saveOrUpdate(CarDto carDto);

}
