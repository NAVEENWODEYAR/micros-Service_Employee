package com.micros.employee.repo;

import com.micros.employee.modal.Employee;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class EmployeeRepo {

    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee emp){
        employees.add(emp);
        return emp;
    }

    public Employee findById(Long eId){
        return employees.stream()
                .filter(e->e.geteId() == eId)
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public  List<Employee> findByDept(Long dId){
        return employees.stream()
                .filter(e -> e.getdId()  == dId)
                .toList();
    }
}
