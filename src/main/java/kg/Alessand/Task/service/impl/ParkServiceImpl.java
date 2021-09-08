package kg.Alessand.Task.service.impl;

import kg.Alessand.Task.dao.ParkRepo;
import kg.Alessand.Task.dao.ParkingHistoryRepo;
import kg.Alessand.Task.model.Park;
import kg.Alessand.Task.service.ParkHistoryService;
import kg.Alessand.Task.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ParkServiceImpl implements ParkService  {
    @Autowired
    ParkRepo parkRepo;
    @Autowired
    ParkingHistoryRepo parkingHistoryRepo;

    @Override
    public List<?> findAll() {
        var park = parkRepo.findAll();
        park.forEach(x-> System.out.println(x.getCar()));
        return park;
    }

    @Override
    public Stream<Park> findAllCarsOnParkNow() {
        List<Park> park = parkRepo.findAll();
        Stream<Park> allPark = park.stream().filter(x-> x.isOnPark()==true);
        return allPark;
    }


    @Override
    public Integer setFreeParking(Long id) {
        return null;
                //parkRepo.setFreePark(id);
    }

    @Override
    public Park comeInn(Park park) {

        Park park1 = parkRepo.save(park);
        return parkRepo.save(park);
    }



    @Override
    public long findFreePlace() {
        List<Park> park = parkRepo.findAll();
        long count = park.stream().filter(x-> x.isOnPark() == true).count();
        //return park;
        long i = 100 - count;
        return i;
    }
    @Override
    public Stream<Park> sendAllFalseToHistory() {
        List<Park> park = parkRepo.findAll();
        Stream<Park> allPark = park.stream().filter(x-> x.isOnPark()==false);
        allPark.toArray();


        return allPark;
    }
}
