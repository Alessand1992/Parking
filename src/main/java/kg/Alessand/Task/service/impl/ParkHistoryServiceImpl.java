package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkingHistoryRepo;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.service.ParkHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ParkHistoryServiceImpl implements ParkHistoryService {
    @Autowired
    ParkingHistoryRepo parkingHistoryRepo;

    @Override
    public List<ParkHistory> findAll() {
        return parkingHistoryRepo.findAll();
    }

    @Override
    public List<ParkHistory> findCarsInDate(Date date) {
        List<ParkHistory> strem = parkingHistoryRepo.findAll();
        List<ParkHistory> back = (List<ParkHistory>) strem.stream().filter(x-> x.getDate1() == date);
        return back;
    }

    @Override
    public Optional<ParkHistory> findParkingStroke(Long id) {
        Optional<ParkHistory> pa = parkingHistoryRepo.findById(id);
        return pa;
    }
}
