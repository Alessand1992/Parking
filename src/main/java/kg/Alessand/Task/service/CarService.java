package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> findAll();

    List<Car> findCarOnNumber(String carNumber);

    Optional<Car> findCarById(Long id);
}
