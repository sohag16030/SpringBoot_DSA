package com.example.paging_with_filtering_and_sorting.controller;

import com.example.paging_with_filtering_and_sorting.dto.EmployeePage;
import com.example.paging_with_filtering_and_sorting.dto.EmployeeSearchCriteria;
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
    public Page<Employee> getAllEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeService.getAllEmployees(employeePage,employeeSearchCriteria);
    }
}
