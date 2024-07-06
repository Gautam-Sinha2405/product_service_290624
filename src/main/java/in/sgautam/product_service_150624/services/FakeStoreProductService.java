package in.sgautam.product_service_150624.services;

import in.sgautam.product_service_150624.dtos.FakeStoreDto;
import in.sgautam.product_service_150624.dtos.ProductResponseDto;
import in.sgautam.product_service_150624.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate){

        this.restTemplate=restTemplate;
    }
    @Override
    public ProductResponseDto getSingleProduct(int productId){
        FakeStoreDto fakeStoreDto=restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+productId,
                FakeStoreDto.class
        );
        return fakeStoreDto.toproductResponseDto();



    }
    @Override
    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price){
        FakeStoreDto fakeStoreDto=new FakeStoreDto();
        fakeStoreDto.setTitle(title);
        fakeStoreDto.setDescription(description);
        fakeStoreDto.setImage(imageUrl);
        fakeStoreDto.setCategory(category);
        fakeStoreDto.setPrice(price);
        FakeStoreDto response = restTemplate.postForObject(
             "https://fakestoreapi.com/products/",
                fakeStoreDto,
                FakeStoreDto.class
        );
        return fakeStoreDto.toproductResponseDto();

    }


}
