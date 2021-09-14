package kg.Alessand.Task.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.Alessand.Task.model.Car;
import kg.Alessand.Task.model.Park;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Date;

@Data
public class ParkHistoryDto {

    private Park park;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date endDate;
}
