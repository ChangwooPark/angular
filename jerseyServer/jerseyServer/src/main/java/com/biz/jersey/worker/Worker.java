package com.biz.jersey.worker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.biz.jersey.company.Company;

@Entity
@Table(name="worker")
public class Worker {
    
    @Id
    @GeneratedValue
    @Column(name="worker_id")
    private int workerId;
    
    @Column(name="worker_name")
    private String workerName;
    
    @ManyToOne
    private Company Company;

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Company getCompany() {
        return Company;
    }

    public void setCompany(Company company) {
        Company = company;
    }
}
