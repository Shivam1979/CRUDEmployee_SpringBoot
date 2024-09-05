package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeException;
import com.example.demo.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) throws EmployeeException {
        if (employee == null) {
            throw new EmployeeException("Employee data is missing");
        } else employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeException {
        Optional <Employee> emp = employeeRepository.findById(id);
        return emp.orElseThrow(() -> new EmployeeException("Employee not found"));
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Optional<Employee> opt = employeeRepository.findById(Math.toIntExact(employee.getEmpId()));
        if (opt.isPresent()){
            employeeRepository.save(employee);
        }else throw new EmployeeException("Customer not found");
        return employee;
    }

    @Override
    public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
        Optional<Employee> opt =  employeeRepository.findById(empId);
        if (opt.isPresent()){
            employeeRepository.delete(opt.get());
        }else throw new EmployeeException("Customer not found");
        return opt.get();
    }

    @Override
    public List<Employee> getAllEmployee() throws EmployeeException {
       List<Employee>  list = employeeRepository.findAll();
       if (list.size()==0){
           throw new EmployeeException("No any Student found");
       }
       return list;
    }
}
