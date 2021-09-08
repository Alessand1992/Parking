package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.ParkHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingHistoryRepo extends JpaRepository<ParkHistory,Long> {
}
