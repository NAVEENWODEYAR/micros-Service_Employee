package com.micros.employee.controller;

import com.micros.employee.modal.Employees;
import com.micros.employee.repo.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("test")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public String testEndPoint(){
        LOGGER.info("testEndPoint");
        return "Welcome to Employee-Service!,";
    }

    @PostMapping("/addEmp")
    public Employees addEmployee(Employees emp){
        LOGGER.info("Employee added: {}"+emp);
        return employeeRepo.addEmployee(emp);
    }

    @GetMapping("/getEmployees")
    public List<Employees> getEmployees(){
        LOGGER.info("Employee list found,");
        return employeeRepo.findAll();
    }

    @GetMapping("/findById/{eId}")
    public Employees findById(@PathVariable Long eId){
        LOGGER.info("Employee found: {}"+eId);
        return employeeRepo.findById(eId);
    }

    @GetMapping("/dept/{dId}")
    public List<Employees> findByDept(@PathVariable Long dId){
        LOGGER.info("Employees of the dept: {}"+dId);
        return employeeRepo.findByDept(dId);
    }
}
