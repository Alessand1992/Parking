package kg.Alessand.Task.mapper;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface CarMapper {


    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car toCar(CarDto carDto);

    CarDto toCarDto(Car car);

    List<Car> toCarsList(List<CarDto> carDtoList);

    List<CarDto> toCarsDtoList(List<Car> carList);
}
//    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
//
//    Car toCar(CarDto carDto);
//
//    CarDto toCarDto(Car car);
//
//    List<Car> toCarList(List<CarDto> carDtoList);
//
//    List<CarDto> toCarDtoList(List<Car> carList);