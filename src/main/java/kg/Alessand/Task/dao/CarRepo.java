package kg.Alessand.Task.dao;

import kg.Alessand.Task.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {
}
