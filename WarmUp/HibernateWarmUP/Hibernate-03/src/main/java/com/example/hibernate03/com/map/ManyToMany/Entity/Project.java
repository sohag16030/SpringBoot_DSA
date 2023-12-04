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
@Table(name="tbl_project")
public class Project {
    @Id
    private int pid;
    private String pname;

    @ManyToMany(mappedBy = "projectList")
    private List<Employee> employeeList;

    public Project(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }
}
