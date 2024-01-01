package com.example.paging_with_filtering_and_sorting.service;

import com.example.paging_with_filtering_and_sorting.dto.EmployeePage;
import com.example.paging_with_filtering_and_sorting.dto.EmployeeSearchCriteria;
import com.example.paging_with_filtering_and_sorting.entities.Employee;
import com.example.paging_with_filtering_and_sorting.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Page<Employee> getAllEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria) {
        PageRequest pageRequest = PageRequest.of(employeePage.getPageNumber(),employeePage.getPageSize(), Sort.Direction.fromString(employeePage.getSortDirection().toString()),employeePage.getSortBy());
        Specification<Employee> specification = (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (Objects.nonNull(employeeSearchCriteria.getFirstName())) {
                predicates.add(criteriaBuilder.like(root.get("firstName"), "%" + employeeSearchCriteria.getFirstName() + "%"));
            }
            if (Objects.nonNull(employeeSearchCriteria.getLastName())) {
                predicates.add(criteriaBuilder.like(root.get("lastName"), "%" + employeeSearchCriteria.getLastName() + "%"));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };

        return employeeRepository.findAll(specification, pageRequest);
    }
}
