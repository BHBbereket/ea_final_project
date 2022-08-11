package edu.miu.cs544.ea_final_project.commandLineRunner;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.JobRepo;
import edu.miu.cs544.ea_final_project.Repository.Offer_repo;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Client_Repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Recuriter_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Hiring_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Screening_repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Technical_Repo;
import edu.miu.cs544.ea_final_project.entities.*;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
@Component
public class CommandLineRunnner implements CommandLineRunner {
    @Autowired
    private Client_Repo client_repo;
    @Autowired
    private Recuriter_Repo recuriter_repo;
    @Autowired
    private Hiring_Repo hiring_repo;
    @Autowired
    private Technical_Repo technical_repo;
    @Autowired
    private Screening_repo screening_repo;
    @Autowired
    private Application_Repo application_repo;
    @Autowired
    private JobRepo jobRepo;
    @Autowired
    private Offer_repo offer_repo;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        Client client=new Client("Microsoft","achive green world","to hire the best engineers","https://microsoft.com");
        Client client2=new Client("Google","achive smart populated world","to hire the best engineers","https://google.com");
        Recuriter recuriter= new Recuriter("kforce");
        Address clientAddress=new Address("NewYork","NewYork",15486);
        Address client2Address=new Address("Mountain","California",75482);
        Address recuriterAddress=new Address("Chicago","Illinios",15486);

        client.setAddress(clientAddress);
        client2.setAddress(client2Address);
        recuriter.setAddress(recuriterAddress);
        client2Address.setCompany(client2);
        clientAddress.setCompany(client);
        recuriterAddress.setCompany(recuriter);

        Job job=new Job("developer",125463.0);
        Job job2=new Job("developer and engineer",152458.0);
        Job job3=new Job("DevOps",145212.0);
        Job job4=new Job("front-end developer",125874.0);
        Skill skill=new Skill("fast typers underpressure","java","Typo",5);
        Skill skill1=new Skill("fast typers underpressure","C#","Typo",5);
        Skill skill5=new Skill("fast typers underpressure","D","Typo",5);
        Skill skill6=new Skill("fast typers underpressure","ruby","Typo",5);
        Skill skill7=new Skill("fast typers underpressure","javascript","Typo",5);
        Skill skill8=new Skill("fast typers underpressure","fortran","Typo",5);
        Skill skill11=new Skill("fast typers underpressure","ASP.net","Typo",5);
        Skill skill12=new Skill("fast typers underpressure","scala","Typo",5);
        Skill skill9=new Skill("fast typers underpressure","functional programing","Typo",5);
        Skill skill10=new Skill("fast typers underpressure","cython","Typo",5);
        Skill skill2=new Skill("fast typers underpressure","C++","Coder",5);
        Skill skill3=new Skill("fast typers underpressure","Phyton","Script developer",5);
        job.setSkills(Arrays.asList(skill,skill2,skill3));
        skill.setExpreince(3);
        skill.setJob(job);
        skill2.setExpreince(2);
        skill2.setJob(job);
        skill3.setExpreince(4);
        skill3.setJob(job);
        job2.setSkills(Arrays.asList(skill1,skill5,skill6));
        skill1.setExpreince(6);
        skill1.setJob(job2);
        skill5.setExpreince(5);
        skill5.setJob(job2);
        skill6.setExpreince(4);
        skill6.setJob(job2);
        job3.setSkills(Arrays.asList(skill7,skill9,skill10));
        skill7.setExpreince(1);
        skill7.setJob(job3);
        skill9.setExpreince(4);
        skill9.setJob(job3);
        skill10.setExpreince(5);
        skill10.setJob(job3);
        job4.setSkills(Arrays.asList(skill8,skill12,skill11));
        skill8.setJob(job4);
        skill11.setJob(job4);
        skill12.setJob(job4);
        recuriter.setClients(Arrays.asList(client, client2));
        client.setJob(Arrays.asList(job,job3));
        client2.setJob(Arrays.asList(job4,job2));
        job.setCompany(client);
        job3.setCompany(client);
        job2.setCompany(client2);
        job4.setCompany(client2);
        Address bereketAddress=new Address("Fairfield","Iowa",1542);
        Address jerryAddress=new Address("Fairfield","Iowa",1542);
        Person bereket= new Person("bereket","bhbbereket@gmail.com","bhb","bereket",bereketAddress);
        Person jerry= new Person("Jerry","jerry@gmail.com","jerry","jerry",jerryAddress);
        bereketAddress.setApplicant(bereket);
        jerryAddress.setApplicant(jerry);
        Application bereketApplication=new Application(LocalDate.now().minusDays(15L),"version 2.05");
        Application bereketApplication2=new Application(LocalDate.now().minusDays(20L),"version 2.10");
        Application bereketApplication3=new Application(LocalDate.now().minusDays(10L),"version 2.15");
        Application bereketApplication4=new Application(LocalDate.now().minusDays(7L),"version 2.78");
        Application jerryApplication=new Application(LocalDate.now().minusDays(25L),"version 2.30");
        bereketApplication.setApplicant(bereket);
        bereketApplication3.setApplicant(bereket);
        bereketApplication4.setApplicant(bereket);
        bereketApplication2.setApplicant(bereket);
        bereketApplication.setJob(job);
        bereketApplication3.setJob(job2);
        bereketApplication4.setJob(job3);
        bereketApplication2.setJob(job4);
        jerryApplication.setApplicant(jerry);
        jerryApplication.setJob(job);

        client_repo.save(client);
        client_repo.save(client2);
        recuriter_repo.save(recuriter);

        jobRepo.save(job);
        jobRepo.save(job2);
        jobRepo.save(job3);
        jobRepo.save(job4);

        personRepository.save(bereket);
        personRepository.save(jerry);

        application_repo.save(bereketApplication);
        application_repo.save(bereketApplication2);
        application_repo.save(bereketApplication3);
        application_repo.save(bereketApplication4);
        application_repo.save(jerryApplication);

        ScreeningInterview screeningInterview=new ScreeningInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),"bereket",75);
        screeningInterview.setApplication(bereketApplication);
        bereketApplication.setScreeningInterview(screeningInterview);
        ScreeningInterview screeningInterview1=new ScreeningInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),"bereket",85);
        screeningInterview.setApplication(bereketApplication2);
        bereketApplication2.setScreeningInterview(screeningInterview1);
        ScreeningInterview screeningInterview2=new ScreeningInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),"bereket",95);
        screeningInterview.setApplication(bereketApplication3);
        bereketApplication3.setScreeningInterview(screeningInterview2);
        ScreeningInterview screeningInterview3=new ScreeningInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),"bereket",97);
        screeningInterview.setApplication(bereketApplication4);
        bereketApplication4.setScreeningInterview(screeningInterview3);

        Questions questions=new Questions("what is JPA");
        Questions questions2=new Questions("what is Spring");
        Questions questions3=new Questions("how you can manage prototype beans");
        Questions questions4=new Questions("can we develop monolithic app from spring boot");

        TechnicalInterview technicalInterview=new TechnicalInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),Location.Online,5);
        technicalInterview.setQuestions(Arrays.asList(questions,questions2,questions3,questions4));
        technicalInterview.setApplication(bereketApplication);
        bereketApplication.setTechnicalInterview(technicalInterview);
        TechnicalInterview technicalInterview2=new TechnicalInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),Location.Online,5);
        technicalInterview.setQuestions(Arrays.asList(questions,questions2,questions3,questions4));
        technicalInterview.setApplication(bereketApplication2);
        bereketApplication2.setTechnicalInterview(technicalInterview2);
        TechnicalInterview technicalInterview3=new TechnicalInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),Location.In_Person,5);
        technicalInterview.setQuestions(Arrays.asList(questions,questions2,questions3,questions4));
        technicalInterview.setApplication(bereketApplication3);
        bereketApplication3.setTechnicalInterview(technicalInterview3);
        TechnicalInterview technicalInterview4=new TechnicalInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),Location.On_Phone,5);
        technicalInterview.setQuestions(Arrays.asList(questions,questions2,questions3,questions4));
        technicalInterview.setApplication(bereketApplication4);
        bereketApplication4.setTechnicalInterview(technicalInterview4);

        HiringInterview hiringInterview=new HiringInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),6,LocalDate.now());
        hiringInterview.setApplication(bereketApplication);
        bereketApplication.setHiringInterview(hiringInterview);
        HiringInterview hiringInterview1=new HiringInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),5,LocalDate.now());
        hiringInterview.setApplication(bereketApplication2);
        bereketApplication2.setHiringInterview(hiringInterview1);
        HiringInterview hiringInterview2=new HiringInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),8,LocalDate.now());
        hiringInterview.setApplication(bereketApplication3);
        bereketApplication3.setHiringInterview(hiringInterview2);
        HiringInterview hiringInterview3=new HiringInterview("6412336548","bhbereket@gmail.com",LocalDate.now(),5,LocalDate.now());
        hiringInterview.setApplication(bereketApplication4);
        bereketApplication4.setHiringInterview(hiringInterview3);

        Offer offer= new Offer("we offered you the new position",LocalDate.now());
        offer.setApplicant(bereket);
        offer.setClient(client);


        screening_repo.save(screeningInterview1);
        screening_repo.save(screeningInterview);
        screening_repo.save(screeningInterview2);
        screening_repo.save(screeningInterview3);

        technical_repo.save(technicalInterview2);
        technical_repo.save(technicalInterview);
        technical_repo.save(technicalInterview3);
        technical_repo.save(technicalInterview4);

        hiring_repo.save(hiringInterview1);
        hiring_repo.save(hiringInterview2);
        hiring_repo.save(hiringInterview);
        hiring_repo.save(hiringInterview3);











    }
}
