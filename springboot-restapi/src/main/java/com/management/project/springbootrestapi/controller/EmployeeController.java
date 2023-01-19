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
<<<<<<< HEAD
    public List<Employee> list( @RequestParam Integer pageNumber,@RequestParam Integer pageSize) {
        return employeeService.listAllEmployee(pageNumber, pageSize);
=======
    public List<Employee> list() {
        return employeeService.listAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable Long id) {
        return employeeService.getEmployee(id);
>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
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
<<<<<<< HEAD
    @GetMapping("/employee/filterByStatus")
    public List<Employee> getByStatus( @RequestParam String status){
        return employeeService.getEmployeeByStatus(status);
    }
    @GetMapping("/employee/{id}")
    public Employee get(long id) {
        return employeeService.getEmployee(id);
    }
    @GetMapping("/employee/sortByNameAsc")
    public List<Employee> getByNameAsc(){
        return employeeService.sortEmployeeByNameAsc();
    }
    @GetMapping("/employee/sortByNameDsc")
    public List<Employee> getByNameDsc(){
        return employeeService.sortEmployeeByNameDsc();
    }
=======
>>>>>>> 72b76b2bcb8886c97e9b878ddb333d2e403e3713
}
