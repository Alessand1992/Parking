package kg.Alessand.Task.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Parking_id")
    private Long id;
    private String carNumber;
    private boolean onPark;
}
