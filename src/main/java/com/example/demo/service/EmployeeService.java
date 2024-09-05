package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee) throws EmployeeException;
    public Employee getEmployeeById(Integer id) throws EmployeeException;
    public  Employee updateEmployee(Employee employeee) throws EmployeeException;
    public Employee deleteEmployeeById(Integer empId) throws EmployeeException;
    public List<Employee> getAllEmployee() throws EmployeeException;
}
