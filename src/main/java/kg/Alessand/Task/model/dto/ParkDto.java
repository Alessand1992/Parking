package kg.Alessand.Task.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.Alessand.Task.model.Car;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;


@Data
public class ParkDto {

    private Car car;
    private boolean onPark;

}