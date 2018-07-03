package com.ericsson.eea.iot.flow.scheduler.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by ehubihu on 4/24/2018.
 */
@SpringBootApplication(scanBasePackages="com.ericsson.eea.iot.flow.scheduler")
public class FlowSchedulerApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println(">>>>>>>>>>>");
        return application.sources(FlowSchedulerApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowSchedulerApp.class, args);
    }
/**
 *                Enhancement to do
 *  1. Add a job to do sync if exception ocurrs
 *  2. Divide FlowStatusMonitor job into two jobs, one for bounded flow, another for unbounded flow(streaming)
 *
 *
 *
 *
 *
 *
 *
  */
}
