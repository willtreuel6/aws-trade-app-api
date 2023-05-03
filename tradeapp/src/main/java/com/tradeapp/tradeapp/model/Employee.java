package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private Integer employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeRole")
    private String employeeRole;

    @Column(name = "employeeDescription")
    private String employeeDescription;

    @Column(name = "employeeLinkOne")
    private String employeeLinkOne;

    @Column(name = "employeeLinkTwo")
    private String employeeLinkTwo;

    public Employee(){}

    public Employee(Integer employeeId, String employeeName, String employeeRole,String employeeDescription, String employeeLinkOne, String employeeLinkTwo){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        this.employeeDescription = employeeDescription;
        this.employeeLinkOne = employeeLinkOne;
        this.employeeLinkTwo = employeeLinkTwo;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getEmployeeDescription() {
        return employeeDescription;
    }

    public void setEmployeeDescription(String employeeDescription) {
        this.employeeDescription = employeeDescription;
    }

    public String getEmployeeLinkOne() {
        return employeeLinkOne;
    }

    public void setEmployeeLinkOne(String employeeLinkOne) {
        this.employeeLinkOne = employeeLinkOne;
    }

    public String getEmployeeLinkTwo() {
        return employeeLinkTwo;
    }

    public void setEmployeeLinkTwo(String employeeLinkTwo) {
        this.employeeLinkTwo = employeeLinkTwo;
    }
}
