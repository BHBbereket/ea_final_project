package edu.miu.cs544.ea_final_project.jms;

import edu.miu.cs544.ea_final_project.entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
//    @Autowired
//    private JmsTemplate jmsTemplate;
//    @Value("${springjms.mqName}")
//    private String queueName;
//
//    public void send(Job job) {
//        jmsTemplate.convertAndSend(queueName, job);
//    }
}
