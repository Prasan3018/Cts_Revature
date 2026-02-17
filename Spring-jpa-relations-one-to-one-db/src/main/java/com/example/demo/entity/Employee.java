package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @SequenceGenerator(
        name = "emp_seq",
        sequenceName = "EMP_SEQ",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    private Long id;

    @Column(name = "EMP_NAME", nullable = false, length = 100)
    private String name;

    @Column(unique = true, nullable = false, length = 130)
    private String email;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private EmployeeProfile profile;

    public Employee() {}

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeProfile getProfile() {
        return profile;
    }

    public void setProfile(EmployeeProfile profile) {
        this.profile = profile;
        if (profile != null) {
            profile.setEmployee(this);
        }
    }
}
