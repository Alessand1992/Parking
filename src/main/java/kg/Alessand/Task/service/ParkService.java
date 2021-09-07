package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Park;

import java.util.List;
import java.util.stream.Stream;

public interface ParkService {

    List<Park> findAll();

    Stream<Park> findAllCarsOnParkNow();

//    ParkDto comeIn(ParkDto parkDto);

    Integer setFreeParking(Long id);

    Park comeInn(Park park);

    Park updateTrueOnFalse(Park park);

    Park findById(Long id);

    long findFreePlace();
}
