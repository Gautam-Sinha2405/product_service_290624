package in.sgautam.product_service_150624.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private int id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
    public ProductResponseDto toproductResponseDto(){
        ProductResponseDto productResponseDto=new ProductResponseDto();
        productResponseDto.setId(id);
        productResponseDto.setTitle(title);
        productResponseDto.setDescription(description);
        productResponseDto.setImage(image);
        productResponseDto.setPrice(price);
        productResponseDto.setCategory(category);
        return productResponseDto;


    }
}
