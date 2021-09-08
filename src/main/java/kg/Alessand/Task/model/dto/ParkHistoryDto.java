package kg.Alessand.Task.model.dto;

import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Park;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;


@Data
public class ParkHistoryDto {

    private Long id;
    private Car car;
    private Park park;
    private Date date1;
    private Date date2;
}
