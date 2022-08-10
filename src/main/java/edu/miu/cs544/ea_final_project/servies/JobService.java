package edu.miu.cs544.ea_final_project.servies;

import edu.miu.cs544.ea_final_project.Repository.AddressRepo;
import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.Repository.SkillRepo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Client_Repo;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Skill;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service

@Transactional
public class JobService {
    @Autowired
    private JobRepo jobRepo;
    @Autowired
    private Application_Repo application_repo;
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private SkillRepo skillRepo;
    @Autowired
    private Client_Repo client_repo;
    @PersistenceContext
    private EntityManager entityManager;

    public Job addSkills(List<Skill> skills,int job_id){
        Job job= jobRepo.findJobById(job_id);
//        for (Skill skill:skills){
//            skill.setJob(job);
//           //skillRepo.save(skill);
//        }
        job.setSkills(skills);
        entityManager.persist(job);
//
       // entityManager.persist(job);
        //skillRepo.saveAll(skills);
        //jobRepo.save(job);
        return job;
    }
    public Job addJob(Job job,int client_id){
        Client client= client_repo.findClientById(client_id);
        job.setCompany(client);
        return jobRepo.save(job);
    }
}
