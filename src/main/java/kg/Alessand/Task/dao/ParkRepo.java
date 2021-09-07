package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ParkRepo extends JpaRepository<Park,Long> {

}
