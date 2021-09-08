package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Park;

import java.util.List;
import java.util.stream.Stream;

public interface ParkService {

    List<?> findAll();

    Stream<Park> findAllCarsOnParkNow();

    Integer setFreeParking(Long id);

    Park comeInn(Park park);

    Stream<Park> sendAllFalseToHistory();


    long findFreePlace();
}
