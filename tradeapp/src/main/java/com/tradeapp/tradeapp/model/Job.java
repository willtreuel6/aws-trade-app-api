package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobId", nullable = false)
    private Integer jobId;

    @Column(name = "jobName")
    private String jobName;

    @Column(name = "jobType")
    private String jobType;

    @Column(name = "jobAddress")
    private String jobAddress;


    @Column(name = "jobCity")
    private String jobCity;

    @Column(name = "jobState")
    private String jobState;

    @Column(name = "jobZip")
    private String jobZip;

    @Column(name = "jobDate")
    private Date jobDate;

    @Column(name = "jobNotes")
    private String jobNotes;

    @Column(name = "jobCustomerId")
    private String jobCustomerId;

    public Job(){}

    public Job(Integer jobId, String jobName, String jobType, String jobAddy, String jobCity, String jobState,
               String jobZip, Date jobDate, String jobNotes, String jobCustomerId){
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobType = jobType;
        this.jobAddress = jobAddy;
        this.jobCity = jobCity;
        this.jobState = jobState;
        this.jobZip = jobZip;
        this.jobDate = jobDate;
        this.jobNotes = jobNotes;
        this.jobCustomerId = jobCustomerId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public String getJobZip() {
        return jobZip;
    }

    public void setJobZip(String jobZip) {
        this.jobZip = jobZip;
    }

    public Date getJobDate() {
        return jobDate;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }

    public String getJobNotes() {
        return jobNotes;
    }

    public void setJobNotes(String jobNotes) {
        this.jobNotes = jobNotes;
    }

    public String getJobCustomerId() {
        return jobCustomerId;
    }

    public void setJobCustomerId(String jobCustomerId) {
        this.jobCustomerId = jobCustomerId;
    }
}
