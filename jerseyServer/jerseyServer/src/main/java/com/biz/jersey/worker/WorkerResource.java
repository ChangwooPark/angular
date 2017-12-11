package com.biz.jersey.worker;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/worker")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;
    
    @GET
    public List<Worker> getWorkers() {
        List<Worker> workers = workerRepository.findAll();
        
        return workers;
    }
    
    @GET
    @Path("{workerId}")
    public Worker getWorker(@PathParam("workerId") int workerId) {
        Worker worker = workerRepository.findOne(workerId);
        
        return worker;
    }
}
