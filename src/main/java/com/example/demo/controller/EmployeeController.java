package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.hibernate.annotations.processing.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.saveEmployee(employee);
        return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer empId){
        Employee emp = employeeService.getEmployeeById(empId);
        return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    }

    @PutMapping("/employee")
    public ResponseEntity <Employee> updateEmployee(@RequestBody Employee newEmployee){
        Employee emp = employeeService.updateEmployee(newEmployee);
        return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees  =employeeService.getAllEmployee();
        return new ResponseEntity<List<Employee>>(employees,HttpStatus.CREATED);
    }





}
