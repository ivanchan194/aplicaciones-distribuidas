package com.uade.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uade.ad.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}