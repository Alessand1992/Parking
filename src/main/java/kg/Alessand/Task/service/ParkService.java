package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;

import java.util.List;

public interface ParkService {

    List<Park> findAll();

    ParkDto comeIn(ParkDto parkDto);

    int setFreeParking(Integer id);

    Park comeInn(Park park);

    Park updateTrueOnFalse(Park park);

    Park findById(Long id);
}
