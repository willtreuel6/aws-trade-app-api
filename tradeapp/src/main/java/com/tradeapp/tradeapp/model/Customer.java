package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private Integer customerId;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerAddress")
    private String customerAddress;

    @Column(name = "customerFirstName")
    private String customerFirstName;

    @Column(name = "customerLastName")
    private String customerLastName;

    @Column(name = "customerCity")
    private String customerCity;

    @Column(name = "customerState")
    private String customerState;

    @Column(name = "customerZip")
    private String customerZip;

    @Column(name = "customerEmail")
    private String customerEmail;

    @Column(name = "customerPhone")
    private String customerPhone;


    public Customer(){}

    public Customer(Integer custId, String custName, String custAddy, String custFN, String custLN, String custCity,
                    String custState, String custZip, String custEmail, String custPhone){
        this.customerId = custId;
        this.customerName = custName;
        this.customerAddress = custAddy;
        this.customerFirstName = custFN;
        this.customerLastName = custLN;
        this.customerCity = custCity;
        this.customerState = custState;
        this.customerZip = custZip;
        this.customerEmail = custEmail;
        this.customerPhone = custPhone;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
