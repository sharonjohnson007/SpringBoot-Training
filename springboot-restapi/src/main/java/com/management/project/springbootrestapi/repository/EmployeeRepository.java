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

    @Query(value = "select * from Employee e order by e.id ASC ", nativeQuery = true)
    List<Employee> sortByIdByASC();

    @Query(value = "select * FROM Employee e order BY e.id DESC", nativeQuery = true)
    List<Employee> sortByIdByDSC();

    @Query(value = "select * from Employee e order by e.name ASC ", nativeQuery = true)
    List<Employee> sortByNameByASC();

    @Query(value = "select * FROM Employee e order BY e.name DESC", nativeQuery = true)
    List<Employee> sortByNameByDSC();

    void save(Employee employee);

    Employee findById(long id);

    void deleteById(long id);

}



