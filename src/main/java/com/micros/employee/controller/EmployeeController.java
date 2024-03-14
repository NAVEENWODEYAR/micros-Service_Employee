package com.micros.employee.controller;

import com.micros.employee.modal.Employee;
import com.micros.employee.repo.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("test")
    public String testEndPoint(){
        return "Welcome to Employee-Service!,";
    }

    @PostMapping("/addEmp")
    public Employee addEmployee(Employee emp){
        return employeeRepo.addEmployee(emp);
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping("/findById/{eId}")
    public Employee findById(@PathVariable Long eId){
        LOGGER.info("Employee found: {}"+eId);
        return employeeRepo.findById(eId);
    }

    @GetMapping("/dept/{dId}")
    public List<Employee> findByDept(@PathVariable Long dId){
        LOGGER.info("Employees of the dept: {}"+dId);
        return employeeRepo.findByDept(dId);
    }
}
