package edu.miu.cs544.ea_final_project.servies;

import edu.miu.cs544.ea_final_project.Repository.Application_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Screening_repo;
import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

//@Service
public class InterviewService {

    @Autowired
    private Screening_repo screening_repo;
    @PersistenceContext
    private EntityManager em;

    @Autowired
    private Application_Repo application_repo;
    public ScreeningInterview screeningInterview(ScreeningInterview screeningInterview,int recuri_id,int app_id){
        Application application=application_repo.findById(app_id).get();
        screeningInterview.setEmail(application.getApplicant().getEmail());
        screeningInterview.setInterviewDate(LocalDate.now());
        //screeningInterview.setApplication(application);
        application.setScreeningInterview(screeningInterview);
        application_repo.save(application);
        return screeningInterview;
    }
    public HiringInterview hiringInterview(HiringInterview hiringInterview, int recuri_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        hiringInterview.setEmail(application.getApplicant().getEmail());
        hiringInterview.setInterviewDate(LocalDate.now());
        //screeningInterview.setApplication(application);
        application.setHiringInterview(hiringInterview);
        application_repo.save(application);
        return hiringInterview;
    }
    public TechnicalInterview technicalInterview(TechnicalInterview technicalInterview, int recuri_id, int app_id){
        Application application=application_repo.findById(app_id).get();
        technicalInterview.setEmail(application.getApplicant().getEmail());
        technicalInterview.setInterviewDate(LocalDate.now());
        //screeningInterview.setApplication(application);
        application.setTechnicalInterview(technicalInterview);
        application_repo.save(application);
        return technicalInterview;
    }

}
