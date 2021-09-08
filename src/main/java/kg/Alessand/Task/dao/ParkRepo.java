package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParkRepo extends JpaRepository<Park,Long> {


}