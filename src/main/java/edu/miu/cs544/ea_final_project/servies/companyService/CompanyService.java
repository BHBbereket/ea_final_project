package edu.miu.cs544.ea_final_project.servies.companyService;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.Repository.Offer_repo;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Client_Repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Company_Repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Recuriter_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Screening_repo;
import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Person;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

@Service
@Transactional
public class CompanyService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private Company_Repo company_repo;
    @Autowired
    private Client_Repo client_repo;
    @Autowired
    private Company_Repo recuriter_repo;

    @Autowired
    private Offer_repo offer_repo;

    @Autowired
    private JobRepo jobRepo;



    public Company addCompany(Company company){
        return company_repo.save(company);
    }

    public Client addClient(Client client){
        return client_repo.save(client);
    }

    public Recuriter addRecuriter(Recuriter recuriter){
        return recuriter_repo.save(recuriter);
    }

    public Offer addOffer(Offer offer,int client_id,int person_id){
        Person person= personRepository.findPersonById(person_id);
        Client client1= client_repo.findClientById(client_id);
        offer.setClient(client1);
        offer.setApplicant(person);
        return offer_repo.save(offer);
    }





}
