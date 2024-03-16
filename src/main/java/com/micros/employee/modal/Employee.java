package com.micros.employee.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//public record Employee(Long eId, Long dId, String eName, int eAge, String position) {}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee{
    private Long eId;
    private Long dId;
    private String eName;
    private int eAge;
    private String position;
}
