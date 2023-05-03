package com.tradeapp.tradeapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceId", nullable = false)
    private Integer serviceId;

    @Column(name = "serviceName")
    private String serviceName;

    @Column(name = "serviceDescription")
    private String serviceDescription;

    @Column(name = "serviceWhatItComesWith")
    private String serviceWhatItComesWith;

    @Column(name = "serviceSatisfactionGuarantee")
    private String serviceSatisfactionGuarantee;

    @Column(name = "servicePath")
    private String servicePath;


    public Services(){}

    public Services(Integer serviceId, String serviceName, String serviceDescription, String serviceWhatItComesWith, String serviceSatisfactionGuarantee, String servicePath){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceWhatItComesWith = serviceWhatItComesWith;
        this.serviceSatisfactionGuarantee = serviceSatisfactionGuarantee;
        this.servicePath = servicePath;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceWhatItComesWith() {
        return serviceWhatItComesWith;
    }

    public void setServiceWhatItComesWith(String serviceWhatItComesWith) {
        this.serviceWhatItComesWith = serviceWhatItComesWith;
    }

    public String getServiceSatisfactionGuarantee() {
        return serviceSatisfactionGuarantee;
    }

    public void setServiceSatisfactionGuarantee(String serviceSatisfactionGuarantee) {
        this.serviceSatisfactionGuarantee = serviceSatisfactionGuarantee;
    }

    public String getServicePath() {
        return servicePath;
    }

    public void setServicePath(String servicePath) {
        this.servicePath = servicePath;
    }
}