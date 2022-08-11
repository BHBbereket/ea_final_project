package edu.miu.cs544.ea_final_project.servies;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Person;
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private Application_Repo application_repo;
    @Autowired
    private JobRepo jobRepo;

    @Autowired
    private PersonRepository personRepository;

    public List<Application> getAllApplication(int job_id){
        Job job=jobRepo.findJobById(job_id);
        return application_repo.findAllByJob(job);
    }
    public Application updateApplication(Application application,int id){
        Application ap=application_repo.findById(id).get();
        ap.setResume_version(application.getResume_version());
        return application_repo.save(ap);
    }
    public void deleteApplication(int id) throws NotFoundException {
        Application ap=application_repo.findById(id).get();
        if(ap==null)
            throw new NotFoundException("Application not Found");

        application_repo.deleteById(id);
    }
    public List<Application> getAll(int id){
        Person p= personRepository.findPersonById(id);
        List<Application> applications=application_repo.findApplicationByApplicant(p);
        return applications;
    }

}
