package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;
import jakarta.websocket.OnClose;

@Entity
@Table(name = "homeservices")
public class Homeservices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homeservicesId")
    private Integer homeservicesId;

    @Column(name = "homeservicesName")
    private String homeservicesName;

    @Column(name = "homeservicesDescription")
    private String homeservicesDescription;

    public Homeservices(){}

    public Homeservices(Integer hsId, String hsName, String hsDescription){
        this.homeservicesId = hsId;
        this.homeservicesName = hsName;
        this.homeservicesDescription = hsDescription;
    }

    public Integer getHomeservicesId() {
        return homeservicesId;
    }

    public void setHomeservicesId(Integer homeservicesId) {
        this.homeservicesId = homeservicesId;
    }

    public String getHomeservicesName() {
        return homeservicesName;
    }

    public void setHomeservicesName(String homeservicesName) {
        this.homeservicesName = homeservicesName;
    }

    public String getHomeservicesDescription() {
        return homeservicesDescription;
    }

    public void setHomeservicesDescription(String homeservicesDescription) {
        this.homeservicesDescription = homeservicesDescription;
    }
}
