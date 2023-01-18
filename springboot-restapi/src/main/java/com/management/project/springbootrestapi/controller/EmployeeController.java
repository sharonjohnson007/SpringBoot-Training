package com.management.project.springbootrestapi.controller;

import com.management.project.springbootrestapi.model.Employee;
import com.management.project.springbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> list() {
        return employeeService.listAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/addEmployee")
    public void add(@RequestBody Employee addEmployee) {
        employeeService.saveEmployee(addEmployee);
    }

    @PutMapping("/employee/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable long id) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }
}
