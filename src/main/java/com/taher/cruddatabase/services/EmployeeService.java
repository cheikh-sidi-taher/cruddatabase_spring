package com.taher.cruddatabase.services;

import java.util.List;

import com.taher.cruddatabase.models.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
