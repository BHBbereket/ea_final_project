package edu.miu.cs544.ea_final_project.jms;

import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.servies.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

//    @Autowired
//    JobService jobService;
//
//    @JmsListener(destination = "${springjms.mqName}")
//    public void receive(Job job) {
//        System.out.println("Received Job object:" + job);
//        //jobService.addJob(job.getApplication(),job);
//    }
}
