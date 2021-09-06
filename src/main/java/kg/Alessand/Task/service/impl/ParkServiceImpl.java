package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkRepo;
import kg.Alessand.Task.mapper.ParkMapper;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.model.dto.ParkDto;
import kg.Alessand.Task.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    ParkRepo parkRepo;

    @Override
    public List<Park> findAll() {
        return parkRepo.findAll();
    }

    @Override
    public ParkDto comeIn(ParkDto parkDto) {
        Park park = ParkMapper.INSTANCE.toPark(parkDto);
        park = parkRepo.save(park);
        return ParkMapper.INSTANCE.toParkDto(park);
    }

    @Override
    public int setFreeParking(Integer id) {
        return parkRepo.setFreePark(id);
    }

    @Override
    public Park comeInn(Park park) {
        Park park1 = parkRepo.save(park);
        return parkRepo.save(park);
    }

    @Override
    public Park updateTrueOnFalse(Park park) {
        Park parkFromBase = findById(park.getId());
        if(parkFromBase == null){
            throw new RuntimeException("Car is not found");
        }else {
            parkFromBase.setOnPark(false);
            return comeInn(parkFromBase);
        }
    }

    @Override
    public Park findById(Long id) {
        Park park = parkRepo.findById(id).orElse(null);
        if(park != null){
            return park;
        }else {
            return null;
        }
    }
}
