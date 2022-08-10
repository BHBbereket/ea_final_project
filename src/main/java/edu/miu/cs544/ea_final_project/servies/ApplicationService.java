package edu.miu.cs544.ea_final_project.servies;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private Application_Repo application_repo;
    @Autowired
    private JobRepo jobRepo;

    public List<Application> getAllApplication(int job_id){
        Job job=jobRepo.findJobById(job_id);
        return application_repo.findAllByJob(job);
    }

}
