package com.example.paging_with_filtering_and_sorting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeSearchCriteria {
    private String firstName;
    private String lastName;
}
