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
    public List<Employee> list(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return employeeService.listAllEmployee(pageNumber, pageSize);
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

    @GetMapping("/employee/filterByStatus")
    public List<Employee> getByStatus(@RequestParam String status) {
        return employeeService.getEmployeeByStatus(status);
    }

    @GetMapping("/employee/sortByNameAsc")
    public List<Employee> getByNameAsc() {
        return employeeService.sortEmployeeByNameAsc();
    }

    @GetMapping("/employee/sortByNameDsc")
    public List<Employee> getByNameDsc() {
        return employeeService.sortEmployeeByNameDsc();
    }
    @GetMapping("/employee/sortByIdAsc")
    public List<Employee> getByIdAsc() {
        return employeeService.sortEmployeeByIdAsc();
    }

    @GetMapping("/employee/sortByIdDsc")
    public List<Employee> getByIdDsc() {
        return employeeService.sortEmployeeByIdDsc();
    }
}


