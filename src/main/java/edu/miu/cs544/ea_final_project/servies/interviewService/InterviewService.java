package edu.miu.cs544.ea_final_project.servies.interviewService;

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
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InterviewService {
    @Autowired
    private Technical_Repo technical_repo;
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

        technicalInterview.setApplication(application);
        return technical_repo.save(technicalInterview);
    }
     public ScreeningInterview addScreeningInterview(ScreeningInterview screeningInterview, int recu_id, int app_id){
        Application application=application_repo.findById(app_id).get();

        screeningInterview.setApplication(application);
        return screening_repo.save(screeningInterview);
    }
     public HiringInterview addHiringInterview(HiringInterview hiringInterview, int recu_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        hiringInterview.setApplication(application);
        return hiring_repo.save(hiringInterview);
    }

    public TechnicalInterview getTechnincalInterview(int id){
        return technical_repo.findById(id).get();
    }
    public ScreeningInterview getScreeningInterview(int id){
        return screening_repo.findById(id).get();
    }
    public HiringInterview getHiringInterview(int id){
        return hiring_repo.findById(id).get();
    }

    public TechnicalInterview updateTechinicalInterview(TechnicalInterview newdata,int tech_id){
        TechnicalInterview technicalInterview=technical_repo.findById(tech_id).get();
        technicalInterview.setEmail(newdata.getEmail()==null?technicalInterview.getEmail(): newdata.getEmail());
        technicalInterview.setInterviewDate(newdata.getInterviewDate()==null?technicalInterview.getInterviewDate():newdata.getInterviewDate());
        technicalInterview.setPhone(newdata.getPhone()==null?technicalInterview.getPhone():newdata.getPhone());

        return technical_repo.save(technicalInterview);
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
        TechnicalInterview technicalInterview=technical_repo.findTechnicalInterviewByApplication(application);
        List<Interview> interviews=new ArrayList<>(Arrays.asList(hiringInterview,screeningInterview,technicalInterview));
        interviews=interviews.stream().filter(interview -> interview!=null).collect(Collectors.toList());
        return interviews;
    }
    public ScreeningInterview screeningInterview(ScreeningInterview screeningInterview,int recuri_id,int app_id){
        Application application=application_repo.findById(app_id).get();
        screeningInterview.setEmail(application.getApplicant().getEmail());
        screeningInterview.setInterviewDate(LocalDate.now());
        screeningInterview.setApplication(application);
        application.setScreeningInterview(screeningInterview);
        application_repo.save(application);
        return screeningInterview;
    }
    public HiringInterview hiringInterview(HiringInterview hiringInterview, int recuri_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        hiringInterview.setEmail(application.getApplicant().getEmail());
        hiringInterview.setInterviewDate(LocalDate.now());
        hiringInterview.setApplication(application);
        application.setHiringInterview(hiringInterview);
        application_repo.save(application);
        return hiringInterview;
    }
    public TechnicalInterview technicalInterview(TechnicalInterview technicalInterview, int recuri_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        technicalInterview.setEmail(application.getApplicant().getEmail());
        technicalInterview.setInterviewDate(LocalDate.now());
        technicalInterview.setApplication(application);
        application.setTechnicalInterview(technicalInterview);
        application_repo.save(application);
        return technicalInterview;
    }

    public void deleteTechnicalInterview(int id) throws NotFoundException {
        TechnicalInterview t= technical_repo.findById(id).get();
        if(t==null){
            throw new NotFoundException("Technical interview not found");
        }
        technical_repo.deleteById(id);
    }
    public void deleteScreening(int id) throws NotFoundException {
        ScreeningInterview s= screening_repo.findById(id).get();
        if(s==null){
            throw new NotFoundException("Screening interview not found");
        }
        screening_repo.deleteById(id);
    }
    public void deleteHiring(int id) throws NotFoundException {
        HiringInterview h= hiring_repo.findById(id).get();
        if(h==null)
            throw new NotFoundException("Hiring interview not found");
        hiring_repo.deleteById(id);
    }







}
