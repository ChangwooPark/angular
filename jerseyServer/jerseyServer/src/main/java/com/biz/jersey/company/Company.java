package com.biz.jersey.company;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.biz.jersey.worker.Worker;

@Entity
@Table(name="company")
public class Company {
    
    @Id
    @GeneratedValue
    @Column(name="company_id")
    private int companyId;
    
    @Column(name="company_name")
    private String companyName;
    
    @OneToMany
    @JoinColumn(name="company_id", referencedColumnName="company_id")
    private List<Worker> workers;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
