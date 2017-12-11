package com.biz.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.biz.jersey.company.CompanyResource;
import com.biz.jersey.worker.WorkerResource;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(CompanyResource.class);
        register(WorkerResource.class);
    }
}
