package com.management.project.springbootrestapi.repository;

import com.management.project.springbootrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
