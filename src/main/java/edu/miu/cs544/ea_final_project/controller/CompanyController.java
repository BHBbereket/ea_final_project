package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.servies.companyService.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/add/company")
    public Company addCompany(@RequestBody Company company){
        return companyService.addCompany(company);
    }
    @PostMapping("/add/client")
    public Client addClient(@RequestBody Client client){
        return companyService.addClient(client);
    }
    @PostMapping("/add/recuriter")
    public Recuriter addRecuriter(@RequestBody Recuriter recuriter){
        return companyService.addRecuriter(recuriter);
    }
    @PostMapping("/add/offer/{client}/{user_id}")
    public Offer addOffer(@RequestBody Offer offer, @PathVariable Integer client,@PathVariable int user_id){

        return companyService.addOffer(offer,client,user_id);
    }
    @PostMapping("/add/{company_id}/job")
    public Job addJob(@RequestBody Job job,@PathVariable int company_id){
        return companyService.addJob(job,company_id);
    }





}
