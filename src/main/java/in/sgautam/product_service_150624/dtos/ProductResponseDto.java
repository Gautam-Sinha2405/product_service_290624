package in.sgautam.product_service_150624.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private int id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
