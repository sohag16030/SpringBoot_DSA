package com.example.paging_with_filtering_and_sorting.controller;

import com.example.paging_with_filtering_and_sorting.entities.Employee;
import com.example.paging_with_filtering_and_sorting.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/getAll")
    public Page<Employee> getAllEmployees(@RequestParam(required = false) String firstName,
                                          @RequestParam(required = false) String lastName,
                                          @RequestParam(defaultValue = "0") int pageNumber,
                                          @RequestParam(defaultValue = "10") int pageSize,
                                          @RequestParam(defaultValue = "ASC") String sortDirection,
                                          @RequestParam(defaultValue = "firstName") String sortBy) {
        return employeeService.getAllEmployees(firstName, lastName, pageNumber, pageSize, sortDirection, sortBy);
    }
}
