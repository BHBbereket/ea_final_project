package edu.miu.cs544.ea_final_project.interviewService;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.comoanyRepository.Recuriter_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Hiring_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Screening_repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Technical_Repo;
import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InterviewService {
    @Autowired
    private Technical_Repo technical_repol;
    @Autowired
    private Screening_repo screening_repo;
    @Autowired
    private Hiring_Repo hiring_repo;
    @Autowired
    private Recuriter_Repo recuriter_repo;
    @Autowired
    private Application_Repo application_repo;

    public TechnicalInterview addTechnicalInterview(TechnicalInterview technicalInterview,int recu_id,int app_id){
        Application application=application_repo.findById(app_id).get();
        Recuriter recuriter=recuriter_repo.findById(recu_id).get();
        technicalInterview.setRecuriter(recuriter);
        technicalInterview.setApplication(application);
        return technical_repol.save(technicalInterview);
    }
     public ScreeningInterview addScreeningInterview(ScreeningInterview screeningInterview, int recu_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        Recuriter recuriter=recuriter_repo.findById(recu_id).get();
        screeningInterview.setRecuriter(recuriter);
        screeningInterview.setApplication(application);
        return screening_repo.save(screeningInterview);
    }
     public HiringInterview addHiringInterview(HiringInterview hiringInterview, int recu_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        Recuriter recuriter=recuriter_repo.findById(recu_id).get();
        hiringInterview.setRecuriter(recuriter);
        hiringInterview.setApplication(application);
        return hiring_repo.save(hiringInterview);
    }

    public TechnicalInterview getTechnincalInterview(int id){
        return technical_repol.findById(id).get();
    }
    public ScreeningInterview getScreeningInterview(int id){
        return screening_repo.findById(id).get();
    }
    public HiringInterview getHiringInterview(int id){
        return hiring_repo.findById(id).get();
    }

    public TechnicalInterview updateTechinicalInterview(TechnicalInterview newdata,int tech_id){
        TechnicalInterview technicalInterview=technical_repol.findById(tech_id).get();
        technicalInterview.setEmail(newdata.getEmail()==null?technicalInterview.getEmail(): newdata.getEmail());
        technicalInterview.setInterviewDate(newdata.getInterviewDate()==null?technicalInterview.getInterviewDate():newdata.getInterviewDate());
        technicalInterview.setPhone(newdata.getPhone()==null?technicalInterview.getPhone():newdata.getPhone());

        return technical_repol.save(technicalInterview);
    }
    public ScreeningInterview updateScreeenInterview(ScreeningInterview newdata,int tech_id){
        ScreeningInterview screeningInterview=screening_repo.findById(tech_id).get();
        screeningInterview.setEmail(newdata.getEmail()==null?screeningInterview.getEmail(): newdata.getEmail());
        screeningInterview.setName(newdata.getName()==null?screeningInterview.getName():newdata.getName());
        screeningInterview.setResult(newdata.getResult()==0?screeningInterview.getResult():newdata.getResult());

        return screening_repo.save(screeningInterview);
    }
    public HiringInterview updateHiringInterview(HiringInterview newdata,int tech_id){
        HiringInterview hiringInterview=hiring_repo.findById(tech_id).get();
        hiringInterview.setEmail(newdata.getEmail()==null?hiringInterview.getEmail(): newdata.getEmail());
        hiringInterview.setInterviewDate(newdata.getInterviewDate()==null?hiringInterview.getInterviewDate():newdata.getInterviewDate());
        hiringInterview.setPhone(newdata.getPhone()==null?hiringInterview.getPhone():newdata.getPhone());

        return hiring_repo.save(hiringInterview);
    }
    public List<Interview> getAllInterview(int application_id){
        Application application=application_repo.findById(application_id).get();
        HiringInterview hiringInterview=hiring_repo.findHiringInterviewByApplication(application);
        ScreeningInterview screeningInterview=screening_repo.findScreeningInterviewByApplication(application);
        TechnicalInterview technicalInterview=technical_repol.findTechnicalInterviewByApplication(application);
        List<Interview> interviews=new ArrayList<>(Arrays.asList(hiringInterview,screeningInterview,technicalInterview));
        interviews=interviews.stream().filter(interview -> interview!=null).collect(Collectors.toList());
        return interviews;
    }








}
