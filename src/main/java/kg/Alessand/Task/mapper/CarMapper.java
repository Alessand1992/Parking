package kg.Alessand.Task.mapper;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.model.dto.ParkDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {
    Car INSTANCE = Mappers.getMapper(Car.class);

    Car toCar(CarDto carDto);

    CarDto toCarDto(Car car);

    List<Car> toCarList(List<CarDto> CarDtoList);

    List<CarDto> toCarDtoList(List<Car> carList);
}
