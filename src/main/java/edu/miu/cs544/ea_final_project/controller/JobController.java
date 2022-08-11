package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Skill;
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import edu.miu.cs544.ea_final_project.servies.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;
    @PostMapping("/add/{company_id}/job")
    public Job addJob(@RequestBody Job job,@PathVariable int company_id){
        return jobService.addJob(job,company_id);
    }
    @PostMapping("/addSkills/{job_id}")
    public Job addSkills(@RequestBody List<Skill> skills,@PathVariable int job_id){
        return jobService.addSkills(skills,job_id);
    }
    @DeleteMapping("/deleteJob/{id}")
    public void deleteJob(@PathVariable int id) throws NotFoundException {
        jobService.deleteJob(id);
    }
    @GetMapping("/getJo/{id}")
    public Job getJob(@PathVariable int id) throws NotFoundException {
        return jobService.getJob(id);
    }
    @PutMapping("/updateJob")
    public Job updateJob(@RequestBody Job job){
        return jobService.updateJob(job);
    }
    @GetMapping("/getAll")
    public List<Job> getAll(){
        return jobService.getAll();
    }

}
