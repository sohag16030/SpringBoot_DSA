package com.example.productstore.Dao;

import com.example.productstore.DTO.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {

    private static int productId = 100;
    List<ProductDto> productList = new ArrayList<>();

    public ProductDao() {
        productList.add(ProductDto.builder().productId("P" + productId++).name("Sony 4k TV 65").price(7979.09).description("Sony 4k LED smart TV").build());
        productList.add(ProductDto.builder().productId("P" + productId++).name("Sony 5k TV 85").price(9877.09).description("Sony 5k LED smart TV").build());
    }

    public List<ProductDto> getProducts() {
        return productList;
    }

    public void addProducts(ProductDto product) {
        product.setProductId("P" + productId++);
        productList.add(product);
    }
}
