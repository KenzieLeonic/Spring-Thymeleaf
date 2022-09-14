package th.ac.ku.restaurant.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class MenuDto {
    private UUID id;
    private String name;
    private double price;
    private String category;
}
