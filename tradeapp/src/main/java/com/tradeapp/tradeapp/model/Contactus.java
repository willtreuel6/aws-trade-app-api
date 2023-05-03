package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "contactus")
public class Contactus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactusId", nullable = false)
    private Integer contactusId;

    @Column(name = "contactusName")
    private String contactusName;

    @Column(name = "contactusEmail")
    private String contactusEmail;

    @Column(name = "contactusCompany")
    private String contactusCompany;

    @Column(name = "contactusMessage")
    private String contactusMessage;


    public Contactus(){}

    public Contactus(Integer contactusId, String contactusName, String contactusEmail, String contactusCompany, String contactusMessage){
        this.contactusId = contactusId;
        this.contactusName = contactusName;
        this.contactusEmail = contactusEmail;
        this.contactusCompany = contactusCompany;
        this.contactusMessage = contactusMessage;
    }

    public Integer getContactusId() {
        return contactusId;
    }

    public void setContactusId(Integer contactusId) {
        this.contactusId = contactusId;
    }

    public String getContactusName() {
        return contactusName;
    }

    public void setContactusName(String contactusName) {
        this.contactusName = contactusName;
    }

    public String getContactusCompany() {
        return contactusCompany;
    }

    public void setContactusCompany(String contactusCompany) {
        this.contactusCompany = contactusCompany;
    }

    public String getContactusEmail() {
        return contactusEmail;
    }

    public void setContactusEmail(String contactusEmail) {
        this.contactusEmail = contactusEmail;
    }

    public String getContactusMessage() {
        return contactusMessage;
    }

    public void setContactusMessage(String contactusMessage) {
        this.contactusMessage = contactusMessage;
    }
}
