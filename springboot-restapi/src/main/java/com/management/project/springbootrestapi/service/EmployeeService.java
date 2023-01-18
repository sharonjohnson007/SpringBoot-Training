package com.management.project.springbootrestapi.service;

import com.management.project.springbootrestapi.model.Employee;
import com.management.project.springbootrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {

        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateEmployee(Employee addEmployee) {
        employeeRepository.save(addEmployee);
        return addEmployee;
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);

    }
}
