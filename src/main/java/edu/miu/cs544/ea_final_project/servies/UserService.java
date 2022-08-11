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
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class UserService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private Application_Repo application_repo;
    @Autowired
    private JobRepo jobRepo;
    @PersistenceContext
    private EntityManager entityManager;
    public Application addApplication(Application application,int job_id,int user_id){
        Job job=jobRepo.findJobById(job_id);
        Person person=personRepository.findPersonById(user_id);
        System.out.println(person+" "+ job);
        application.setApplicant(person);
        application.setJob(job);
        entityManager.persist(application);
        job.setApplication(application);
        jobRepo.save(job);
        return application;
    }
    public Person add(Person person){
        return personRepository.save(person);
    }

    public void deleteUser(int id) throws NotFoundException {
        Person p= personRepository.findPersonById(id);
        if(p==null)
            throw new NotFoundException("user not found");
        personRepository.deleteById(id);
    }
    public Person updatePerson(Person person,int id) throws NotFoundException {
        Person p=personRepository.findPersonById(id);
        if(p==null)
            throw new NotFoundException("user not found");

        return personRepository.save(person);
    }

    public Person getPerson(int id) throws NotFoundException {
        Person p= personRepository.findPersonById(id);
        if(p==null)
            throw new NotFoundException("user not found");
        return p;
    }
}
