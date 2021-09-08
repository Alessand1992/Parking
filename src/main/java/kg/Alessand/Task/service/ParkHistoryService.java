package kg.Alessand.Task.service;

import kg.Alessand.Task.model.ParkHistory;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface ParkHistoryService {

    List<ParkHistory> findAll();

    List<ParkHistory> findCarsInDate(Date date);

    Optional<ParkHistory> findParkingStroke(Long id);

}
