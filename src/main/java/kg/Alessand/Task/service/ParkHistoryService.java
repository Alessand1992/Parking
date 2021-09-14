package kg.Alessand.Task.service;

import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.model.dto.ParkHistoryDto;

import java.util.List;
import java.util.Optional;

public interface ParkHistoryService {

    List<ParkHistory> findAll();

    ParkHistoryDto save(ParkHistoryDto parkHistoryDto);

    Optional<ParkHistory> findById(Long id);



}
