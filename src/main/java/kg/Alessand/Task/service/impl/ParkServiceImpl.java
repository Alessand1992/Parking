package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.CarRepo;
import kg.Alessand.Task.dao.ParkRepo;
import kg.Alessand.Task.mapper.CarMapper;
import kg.Alessand.Task.mapper.ParkMapper;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.CarDto;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.service.ParkService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    CarRepo carRepo;
    @Autowired
    ParkRepo parkRepo;
    @Override
    public ParkDto saveOrUpdate(ParkDto parkDto) {
        int count = findAllFreePlace();
        SimpleDateFormat sfm = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        date.getTime();
        sfm.format(date);
        if(count <= 100) {
            Park park = ParkMapper.INSTANCE.toPark(parkDto);
            park.setDate(date);
            park = parkRepo.saveAndFlush(park);
            return ParkMapper.INSTANCE.toParkDto(park);
        }else {
            return null;
        }
    }

    @Override
    public List<Park> findAll() {
        return parkRepo.findAll();
    }

    @Override
    public int findAllFreePlace() {
        List<Park> findall = parkRepo.findAll();
        int y = (int) findall.stream().filter(x->x.isOnPark() == true).count();
        return 100 - y;
    }

    @Override
    public String setFree(Long id) {
        parkRepo.findById(id).stream().forEach(x-> x.setOnPark(false));
            return "Successfully";
        }

    @Override
    public Optional<Park> findById(Long id) {
        return parkRepo.findById(id);
    }
}
