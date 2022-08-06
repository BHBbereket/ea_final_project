package edu.miu.cs544.ea_final_project.possithion_and_application.controller;

import edu.miu.cs544.ea_final_project.possithion_and_application.entities.Job;
import edu.miu.cs544.ea_final_project.possithion_and_application.entities.Skill;
import edu.miu.cs544.ea_final_project.possithion_and_application.repository.Application_Repo;
import edu.miu.cs544.ea_final_project.possithion_and_application.repository.JobRepo;
import edu.miu.cs544.ea_final_project.possithion_and_application.repository.SkillRepo;
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
        return job;
    }

}
