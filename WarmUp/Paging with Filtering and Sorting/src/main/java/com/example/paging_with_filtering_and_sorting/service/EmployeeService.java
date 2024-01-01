package com.example.paging_with_filtering_and_sorting.service;

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

    public Page<Employee> getAllEmployees(String firstName, String lastName, int pageNumber, int pageSize,
                                          String sortDirection, String sortBy) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.Direction.fromString(sortDirection), sortBy);
        Specification<Employee> specification = (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (Objects.nonNull(firstName)) {
                predicates.add(criteriaBuilder.like(root.get("firstName"), "%" + firstName + "%"));
            }
            if (Objects.nonNull(lastName)) {
                predicates.add(criteriaBuilder.like(root.get("lastName"), "%" + lastName + "%"));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };

        return employeeRepository.findAll(specification, pageRequest);
    }
}
