package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkHistoryRepo;
import kg.Alessand.Task.dao.ParkRepo;
import kg.Alessand.Task.mapper.ParkHistoryMapper;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.ParkHistory;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.model.dto.ParkHistoryDto;
import kg.Alessand.Task.service.ParkHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class ParkHistoryServiceImpl implements ParkHistoryService {
    @Autowired
    ParkHistoryRepo parkHistoryRepo;
    @Autowired
    ParkRepo parkRepo;
    @Override
    public List<ParkHistory> findAll() {
        return parkHistoryRepo.findAll();
    }

    @Override
    public ParkHistoryDto save(ParkHistoryDto parkHistoryDto) {
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();
        ParkHistory parkHistory = ParkHistoryMapper.INSTANCE.toParkHistory(parkHistoryDto);
        parkHistory.setCalendar(calendar);
        parkHistory = parkHistoryRepo.save(parkHistory);

        Long id = parkHistory.getId();
        parkRepo.findById(id).stream().forEach(x-> x.setOnPark(false));

        return ParkHistoryMapper.INSTANCE.toParkHistoryDto(parkHistory);

    }

    @Override
    public Optional<ParkHistory> findById(Long id) {
        return parkHistoryRepo.findById(id);
    }
}
