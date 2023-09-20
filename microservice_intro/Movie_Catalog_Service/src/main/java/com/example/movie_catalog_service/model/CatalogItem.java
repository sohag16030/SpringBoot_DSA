package com.example.movie_catalog_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CatalogItem {
    private String name;
    private String description;
    private int ratings;
}
