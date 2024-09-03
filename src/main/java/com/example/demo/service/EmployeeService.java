package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeException;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee) throws EmployeeException;
    public Employee getEmployeeById(Integer id) throws EmployeeException;
    public  Employee updateEmployee(Employee employeee) throws EmployeeException;
    public Employee deleteEmployeeById(Integer empId) throws EmployeeException;
    public List<Employee> getAllEmployee() throws EmployeeException;
}
