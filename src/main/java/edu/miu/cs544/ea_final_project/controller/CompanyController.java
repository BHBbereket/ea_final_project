package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Person;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Client_Repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Company_Repo;
import edu.miu.cs544.ea_final_project.Repository.Offer_repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Recuriter_Repo;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    private Client_Repo client_repo;
    @Autowired
    private Company_Repo company_repo;
    @Autowired
    private Recuriter_Repo recuriter_repo;
    @Autowired
    private Offer_repo offer_repo;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private JobRepo jobRepo;

    @PostMapping("/add/company")
    public Company addCompany(@RequestBody Company company){
        return company_repo.save(company);
    }
    @PostMapping("/add/client")
    public Client addClient(@RequestBody Client client){
        return client_repo.save(client);
    }
    @PostMapping("/add/recuriter")
    public Recuriter addRecuriter(@RequestBody Recuriter recuriter){
        return recuriter_repo.save(recuriter);
    }
    @PostMapping("/add/offer/{client}/{user_id}")
    public Offer addOffer(@RequestBody Offer offer, @PathVariable Integer client,@PathVariable int user_id){
        Person person= personRepository.findPersonById(user_id);
        Client client1= client_repo.findClientById(client);
        offer.setClient(client1);
        offer.setApplicant(person);
        return offer_repo.save(offer);
    }
    @PostMapping("/add/{company_id}/job")
    public Job addJob(@RequestBody Job job,@PathVariable int company_id){
        Client client= client_repo.findClientById(company_id);
        job.setCompany(client);
        return jobRepo.save(job);
    }





}
