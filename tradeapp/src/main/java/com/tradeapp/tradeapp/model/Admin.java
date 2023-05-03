package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId", nullable = false)
    private Integer adminId;

    @Column(name = "adminFirstName")
    private String adminFirstName;

    @Column(name = "adminLastName")
    private String adminLastName;

    @Column(name = "adminUsername")
    private String adminUsername;

    @Column(name = "adminPassword")
    private String adminPassword;


    public Admin() {
    }

    public Admin(Integer adminId, String fName, String lName, String adminUsername, String adminPassword){
        this.adminFirstName = fName;
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.adminLastName = lName;
        this.adminUsername = adminUsername;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
