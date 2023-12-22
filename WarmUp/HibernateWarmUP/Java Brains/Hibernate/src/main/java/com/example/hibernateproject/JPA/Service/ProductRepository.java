package com.example.hibernateproject.JPA.Service;

import com.example.hibernateproject.JPA.DTO.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

