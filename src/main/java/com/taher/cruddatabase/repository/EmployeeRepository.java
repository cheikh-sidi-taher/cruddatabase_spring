package com.taher.cruddatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taher.cruddatabase.models.Employee;

@Repository   
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // You can add custom queries here if needed
}
