package edu.miu.cs544.ea_final_project.Interveiw.controller;

import edu.miu.cs544.ea_final_project.Interveiw.entities.TechnicalInterview;
import edu.miu.cs544.ea_final_project.Interveiw.repository.Hiring_Repo;
import edu.miu.cs544.ea_final_project.Interveiw.repository.Screening_repo;
import edu.miu.cs544.ea_final_project.Interveiw.repository.Technical_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewController {
    @Autowired
    public Technical_Repo technical_repo;
    @Autowired
    public Screening_repo screening_repo;
    @Autowired
    public Hiring_Repo hiring_repo;

    @PostMapping("")
    public TechnicalInterview addTechnicall(TechnicalInterview technicalInterview){
        return technical_repo.save(technicalInterview);
    }

}
