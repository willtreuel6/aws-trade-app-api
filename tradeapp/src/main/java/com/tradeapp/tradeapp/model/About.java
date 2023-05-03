package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name="about")
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aboutId")
    private Integer aboutId;

    @Column(name = "aboutHeader")
    private String aboutHeader;

    @Column(name = "aboutDescription")
    private String aboutDescription;

    public About(){}

    public About(Integer aboutId, String aboutHeader, String aboutDescription){
        this.aboutId = aboutId;
        this.aboutHeader = aboutHeader;
        this.aboutDescription = aboutDescription;
    }

    public Integer getAboutId() {
        return aboutId;
    }

    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
    }

    public String getAboutHeader() {
        return aboutHeader;
    }

    public void setAboutHeader(String aboutHeader) {
        this.aboutHeader = aboutHeader;
    }

    public String getAboutDescription() {
        return aboutDescription;
    }

    public void setAboutDescription(String aboutDescription) {
        this.aboutDescription = aboutDescription;
    }
}
