package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_PROFILES")
public class EmployeeProfile {

    @Id
    @SequenceGenerator(
        name = "emp_profile_seq",
        sequenceName = "EMP_PROFILE_SEQ",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_profile_seq")
    private Long id;

    @Column(name = "PHONE", length = 15, nullable = false)
    private String phone;

    @Column(name = "ADDRESS", length = 200)
    private String address;

    @OneToOne
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false, unique = true)
    private Employee employee;

    public EmployeeProfile() {}

    public EmployeeProfile(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
