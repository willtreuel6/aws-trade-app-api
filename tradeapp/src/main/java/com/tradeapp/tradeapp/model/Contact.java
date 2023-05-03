package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name="contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactId")
    private Integer contactId;

    @Column(name = "contactDescription")
    private String contactDescription;

    @Column(name = "contactAddress")
    private String contactAddress;

    @Column(name = "contactEmail")
    private String contactEmail;

    @Column(name = "contactPhone")
    private String contactPhone;

    @Column(name = "contactMonday")
    private String contactMonday;

    @Column(name = "contactTuesday")
    private String contactTuesday;

    @Column(name = "contactWednesday")
    private String contactWednesday;

    @Column(name = "contactThursday")
    private String contactThursday;

    @Column(name = "contactFriday")
    private String contactFriday;

    @Column(name = "contactSaturday")
    private String contactSaturday;

    @Column(name = "contactSunday")
    private String contactSunday;

    @Column(name = "contactUsHeader")
    private String contactUsHeader;

    @Column(name = "contactUsDescription")
    private String contactUsDescription;

    public Contact(){}

    public Contact(Integer contactId, String contactDescription, String contactAddress, String contactEmail,
                   String contactPhone, String contactMonday, String contactTuesday, String contactWednesday, String contactThursday,
                   String contactFriday, String contactSaturday, String contactSunday, String contactUsHeader, String contactUsDescription){
        this.contactId = contactId;
        this.contactDescription = contactDescription;
        this.contactAddress = contactAddress;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.contactMonday = contactMonday;
        this.contactTuesday = contactTuesday;
        this.contactWednesday = contactWednesday;
        this.contactThursday = contactThursday;
        this.contactFriday = contactFriday;
        this.contactSaturday = contactSaturday;
        this.contactSunday = contactSunday;
        this.contactUsHeader = contactUsHeader;
        this.contactUsDescription = contactUsDescription;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactDescription() {
        return contactDescription;
    }

    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactMonday() {
        return contactMonday;
    }

    public void setContactMonday(String contactMonday) {
        this.contactMonday = contactMonday;
    }

    public String getContactTuesday() {
        return contactTuesday;
    }

    public void setContactTuesday(String contactTuesday) {
        this.contactTuesday = contactTuesday;
    }

    public String getContactWednesday() {
        return contactWednesday;
    }

    public void setContactWednesday(String contactWednesday) {
        this.contactWednesday = contactWednesday;
    }

    public String getContactThursday() {
        return contactThursday;
    }

    public void setContactThursday(String contactThursday) {
        this.contactThursday = contactThursday;
    }

    public String getContactFriday() {
        return contactFriday;
    }

    public void setContactFriday(String contactFriday) {
        this.contactFriday = contactFriday;
    }

    public String getContactSaturday() {
        return contactSaturday;
    }

    public void setContactSaturday(String contactSaturday) {
        this.contactSaturday = contactSaturday;
    }

    public String getContactSunday() {
        return contactSunday;
    }

    public void setContactSunday(String contactSunday) {
        this.contactSunday = contactSunday;
    }

    public String getContactUsHeader() {
        return contactUsHeader;
    }

    public void setContactUsHeader(String contactUsHeader) {
        this.contactUsHeader = contactUsHeader;
    }

    public String getContactUsDescription() {
        return contactUsDescription;
    }

    public void setContactUsDescription(String contactUsDescription) {
        this.contactUsDescription = contactUsDescription;
    }
}

