package kg.Alessand.Task.mapper;

import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.model.dto.ParkHistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ParkHistoryMapper {

    ParkHistoryMapper INSTANCE = Mappers.getMapper(ParkHistoryMapper.class);

    ParkHistory toParkHistory(ParkHistoryDto parkhistoryDto);

    ParkHistoryDto toParkHistoryDto(ParkHistory parkHistory);

    List<ParkHistory> toParkHistoryList(List<ParkHistoryDto> ParkHistoryDtoList);

    List<ParkHistoryDto> toParkHistoryDtoList(List<ParkHistory> parkHistoriesList);
}
