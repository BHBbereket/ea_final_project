package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import edu.miu.cs544.ea_final_project.servies.ApplicationService;
import edu.miu.cs544.ea_final_project.servies.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationContoroller {
    @Autowired
    private ApplicationService applicationService;
    @GetMapping("/getAllApplication/{job_id}")
    public List<Application> getAllApplication(@PathVariable int job_id){
        return applicationService.getAllApplication(job_id);
    }

    @PutMapping("/updateApplication/{id}")
    public Application updateApplication(@RequestBody Application application,@PathVariable int id){
        return applicationService.updateApplication(application,id);
    }
    @DeleteMapping("/deleteApplcaiont/{id}")
    public void deleteCompany(@PathVariable int id) throws NotFoundException {
        applicationService.deleteApplication(id);
    }
    @GetMapping("/getApplications/{id}")
    public List<Application> getAll(@PathVariable int id){
        return applicationService.getAll(id);
    }

}
