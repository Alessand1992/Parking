package kg.Alessand.Task.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "park_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "Car_id")
    private Car car;
    private boolean onPark;
    @Column(name = "start_date")
    private Date date1;


}
