package com.example.hibernate03.com.map.ManyToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_employee")
public class Employee {
    @Id
    private int eid;
    private String ename;

    @ManyToMany
    @JoinTable(
            name = "tbl_employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projectList;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
}
