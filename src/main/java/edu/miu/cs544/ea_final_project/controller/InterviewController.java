package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Hiring_Repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Screening_repo;
import edu.miu.cs544.ea_final_project.Repository.interviewrepository.Technical_Repo;
import edu.miu.cs544.ea_final_project.servies.interviewService.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @PostMapping("/addTechnical/{recuriter_id}/{application_id}")
    public TechnicalInterview addTechnicall(TechnicalInterview technicalInterview,int recuriter_id,int application_id){
        return null;
    }
    @PostMapping("/addScreening/{recuriter_id}/{application_id}")
    public ScreeningInterview addScreeningInterview(ScreeningInterview screeningInterview,int recuriter_id,int application_id){
        return null;
    }

    @PostMapping("/addHiringInterview/{recuriter_id}/{application_id}")
    public HiringInterview addHiringIntervicw(HiringInterview hiringInterview,int recuriter_id,int application_id){
        return hiringInterview;
    }

    @GetMapping("/getTecknicalResult/{application_id}")
    public TechnicalInterview getTechincalInterviewResult(int application_id){
        return null;
    }
    @GetMapping("/getScreeningInterviewResull/{application_id}")
    public ScreeningInterview getScreeningInterviewResult(int application_id){
        return null;
    }
    @GetMapping("/getHiringInterviewResult/{application_id}")
    public HiringInterview getHiringInterviewResult(int application_id){
        return null;
    }
    @PutMapping("/updateTechnical")
    public TechnicalInterview updateTechincalInterview(@RequestBody TechnicalInterview technicalInterview){
        return null;
    }
    @PutMapping("/updateScreening")
    public ScreeningInterview updateScreeningInterview(@RequestBody ScreeningInterview screeningInterview){
        return null;
    }
    @PutMapping("/updateHiring")
    public HiringInterview updateHiringInterview(@RequestBody HiringInterview hiringInterview){
        return null;
    }


}
