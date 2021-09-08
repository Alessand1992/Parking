package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.CarRepo;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepo carRepo;

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public List<Car> findCarOnNumber(String carNumber) {
        List<Car> strem = carRepo.findAll();
        Stream<Car> number =strem.stream().filter(x -> x.getCarNumber().equals(carNumber));
        return (List<Car>) number;
    }

    @Override
    public Optional<Car> findCarById(Long id) {
        return carRepo.findById(id);
    }
}
