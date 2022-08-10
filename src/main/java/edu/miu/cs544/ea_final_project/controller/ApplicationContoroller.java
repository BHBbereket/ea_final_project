package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationContoroller {


    @GetMapping("/getAllApplication/{job_id}")
    public List<Application> getAllApplication(@PathVariable int job_id){
        return null;
    }

}
