package kg.Alessand.Task.model;


import lombok.Data;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


@Data
@Entity
@Table(name = "parkHistory")
public class ParkHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parkHistory_id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "park_id")
    private Park park;
    @Column(name = "end_date")
    private GregorianCalendar calendar;
}
