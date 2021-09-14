package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.ParkHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkHistoryRepo extends JpaRepository<ParkHistory,Long>{
}
