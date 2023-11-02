package com.department.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name="Department")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO )
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentAddress;
}
