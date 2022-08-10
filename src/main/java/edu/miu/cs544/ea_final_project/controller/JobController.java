package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Skill;
import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.Repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobRepo jobRepo;
    @Autowired
    private Application_Repo application_repo;

    @Autowired
    private SkillRepo skillRepo;
    @PostMapping("/addSkills/{job_id}")
    public Job addSkills(@RequestBody List<Skill> skills,@PathVariable int job_id){
        Job job= jobRepo.findJobById(job_id);
        job.setSkills(skills);
        skillRepo.saveAll(skills);
        return job;
    }

}
