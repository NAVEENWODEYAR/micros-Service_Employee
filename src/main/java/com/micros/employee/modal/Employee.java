package com.micros.employee.modal;

import jakarta.persistence.Id;
import lombok.Data;

//public record Employee(Long eId, Long dId, String eName, int eAge, String position) {}
@Data
public class Employee {
    @Id
    private Long eId;
    private Long dId;
    private String eName;
    private Integer eAge;
    private String position;

    public Employee(){}
    public Employee(Long eId, Long dId, String eName, Integer eAge, String position) {
        this.eId = eId;
        this.dId = dId;
        this.eName = eName;
        this.eAge = eAge;
        this.position = position;
    }

    public Long geteId() {
        return eId;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer geteAge() {
        return eAge;
    }

    public void seteAge(Integer eAge) {
        this.eAge = eAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
