package in.sgautam.product_service_150624.services;

import in.sgautam.product_service_150624.dtos.FakeStoreDto;
import in.sgautam.product_service_150624.dtos.ProductResponseDto;

public interface ProductService {
    public ProductResponseDto getSingleProduct(int productId);
    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);


}
