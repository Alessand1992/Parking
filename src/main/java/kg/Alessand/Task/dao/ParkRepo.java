package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ParkRepo extends JpaRepository<Park,Long> {


}