package com.management.project.springbootrestapi.repository;

import com.management.project.springbootrestapi.controller.EmployeeController;
import com.management.project.springbootrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
   List<Employee> findByStatus(String status);
   //Error in query -pending 
   @Query(value ="FROM Employee ORDER BY NAME ASC",nativeQuery = true)
   List<Employee> sortByNameASC();
   @Query(value ="FROM Employee ORDER BY NAME DSC",nativeQuery = true)
   List<Employee> sortByNameDSC();

   void save(Employee employee);

   Employee findById(long id);

  // Employee findById(long id);

   void deleteById(long id);
}