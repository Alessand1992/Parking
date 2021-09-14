package kg.Alessand.Task.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ParkHistory")
public class ParkHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ParkingHistoryId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "park_id")
    private Park park;
    @Column(name = "end_date")
    private Date endDate;

}