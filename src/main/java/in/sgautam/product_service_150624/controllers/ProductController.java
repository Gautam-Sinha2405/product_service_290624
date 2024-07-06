package in.sgautam.product_service_150624.controllers;

import in.sgautam.product_service_150624.dtos.ProductResponseDto;
import in.sgautam.product_service_150624.models.Product;
import in.sgautam.product_service_150624.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;

    }
    @GetMapping("/products/{id}")
    public ProductResponseDto getProductDetails(@PathVariable("id") int productId){
        return productService.getSingleProduct(productId);


    }
    @PostMapping("/products")
    public ProductResponseDto createNewProduct(@RequestBody ProductResponseDto productRequestDto){
        return productService.addProduct(
                productRequestDto.getTitle(),
                productRequestDto.getDescription(),
                productRequestDto.getImage(),
                productRequestDto.getCategory(),
                productRequestDto.getPrice()
        );


    }


}
