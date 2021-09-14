package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.CarRepo;
import kg.Alessand.Task.mapper.CarMapper;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepo carRepo;

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public CarDto saveOrUpdate(CarDto carDto) {
//        Car car = CarMapper.INSTANCE.toCar(carDto);
//        car = carRepo.saveAndFlush(car);
//        return CarMapper.INSTANCE.toCarDto(car);
        Car car = CarMapper.INSTANCE.toCar(carDto);
        car = carRepo.saveAndFlush(car);
        return CarMapper.INSTANCE.toCarDto(car);

    }
}
