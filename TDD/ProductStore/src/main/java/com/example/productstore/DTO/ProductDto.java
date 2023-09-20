package com.example.productstore.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class ProductDto {
    private String productId;
    private String name;
    private double price;
    private String description;
}
