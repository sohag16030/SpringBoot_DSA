package com.example.productstore.Controller;

import com.example.productstore.DTO.ProductDto;
import com.example.productstore.Dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/products")
    public List<ProductDto> products(){
        return productDao.getProducts();
    }

    @PostMapping(value = "/addProduct")
    public void addProducts(@RequestBody ProductDto product){
        productDao.addProducts(product);
    }
}
