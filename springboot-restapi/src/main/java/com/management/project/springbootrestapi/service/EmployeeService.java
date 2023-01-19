package com.management.project.springbootrestapi.service;

import com.management.project.springbootrestapi.model.Employee;
import com.management.project.springbootrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
=======
>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

<<<<<<< HEAD
    public List<Employee> listAllEmployee(int pageNumber,int pageSize) {
        Pageable pageable= PageRequest.of(pageNumber,pageSize);
        return employeeRepository.findAll(pageable).getContent();
    }

    public Employee saveEmployee(Employee employee) {
=======
    public List<Employee> listAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {

>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateEmployee(Employee addEmployee) {
        employeeRepository.save(addEmployee);
        return addEmployee;
    }

    public Employee getEmployee(long id) {
<<<<<<< HEAD
        return employeeRepository.findById(id);
=======
        return employeeRepository.findById(id).get();
>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
<<<<<<< HEAD
    }
    public List<Employee> getEmployeeByStatus(String status){
        return employeeRepository.findByStatus(status);
    }
    public List<Employee> sortEmployeeByNameAsc(){
        return employeeRepository.sortByNameASC();
    }
    public List<Employee> sortEmployeeByNameDsc(){
        return employeeRepository.sortByNameDSC();
=======

>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
    }
}
