package com.uade.ad.service;

import com.uade.ad.model.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}