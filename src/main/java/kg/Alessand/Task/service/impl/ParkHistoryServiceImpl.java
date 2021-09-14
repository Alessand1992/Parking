package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkHistoryRepo;
import kg.Alessand.Task.mapper.ParkHistoryMapper;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.model.dto.ParkHistoryDto;
import kg.Alessand.Task.service.ParkHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkHistoryServiceImpl implements ParkHistoryService {
    @Autowired
    ParkHistoryRepo parkHistoryRepo;
    @Override
    public List<ParkHistory> findAll() {
        return parkHistoryRepo.findAll();
    }

    @Override
    public ParkHistoryDto save(ParkHistoryDto parkHistoryDto) {
        ParkHistory parkHistory = ParkHistoryMapper.INSTANCE.toParkHistory(parkHistoryDto);
        parkHistory = parkHistoryRepo.save(parkHistory);
        return ParkHistoryMapper.INSTANCE.toParkHistoryDto(parkHistory);
    }

    @Override
    public Optional<ParkHistory> findById(Long id) {
        return parkHistoryRepo.findById(id);
    }
}
