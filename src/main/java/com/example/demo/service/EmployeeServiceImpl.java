package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeException;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee saveEmployee(Employee employee) throws EmployeeException {
        return null;
    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeException {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employeee) throws EmployeeException {
        return null;
    }

    @Override
    public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() throws EmployeeException {
        return List.of();
    }
}
