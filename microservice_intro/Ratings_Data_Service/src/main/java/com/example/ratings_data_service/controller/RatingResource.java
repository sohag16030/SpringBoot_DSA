package com.example.ratings_data_service.controller;

import com.example.ratings_data_service.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
    @GetMapping("/{userId}")
    public List<Rating> setRatings(@PathVariable("userId") String userId) {
        return Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3),
                new Rating("9101", 4)
        );
    }
}
