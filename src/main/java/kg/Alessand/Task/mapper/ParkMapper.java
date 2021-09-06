package kg.Alessand.Task.mapper;

import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkMapper {
    //ParkMapper INSTANCE = Mappers.getMapper(ParkMapper.class);
    ParkMapper INSTANCE = Mappers.getMapper(ParkMapper.class);

    Park toPark(ParkDto parkDto);

    ParkDto toParkDto(Park park);

    List<Park> toParkList(List<ParkDto> ParkDtoList);

    List<ParkDto> toParkDtoList(List<Park> parkList);
}