package com.biz.jersey.company;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/company")
public class CompanyResource {
    
    @Autowired
    CompanyRepository companyRepository;
    
    @GET
    public List<Company> getCompanys() {
        List<Company> companys = companyRepository.findAll();
        
        return companys;
    }
    
    @GET
    @Path("{comapnyId}")
    public Company getCompany(@PathParam("comapnyId") int companyId) {
        Company company = companyRepository.findOne(companyId);
        
        return company;
    }
}
