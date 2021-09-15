package kg.Alessand.Task.service;

import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;

import java.util.List;
import java.util.Optional;

public interface ParkService {

    ParkDto saveOrUpdate(ParkDto parkDto);

    List<Park> findAll();

    int findAllFreePlace();

    String setFree(Long id);

    Optional<Park> findById(Long id);

}
