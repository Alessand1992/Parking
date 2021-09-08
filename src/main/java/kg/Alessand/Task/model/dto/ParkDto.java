package kg.Alessand.Task.model.dto;

import lombok.Data;

import java.util.Date;


@Data
public class ParkDto {

    private Long id;
    private String carNumber;
    private boolean onPark;
    private Date date;
}