package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import edu.miu.cs544.ea_final_project.servies.interviewService.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @PostMapping("/addTechnical/{recuriter_id}/{application_id}")
    public TechnicalInterview addTechnicall(TechnicalInterview technicalInterview,int recuriter_id,int application_id){
        return interviewService.addTechnicalInterview(technicalInterview,recuriter_id,application_id);
    }
    @PostMapping("/addScreening/{recuriter_id}/{application_id}")
    public ScreeningInterview addScreeningInterview(ScreeningInterview screeningInterview,int recuriter_id,int application_id){
        return interviewService.addScreeningInterview(screeningInterview,recuriter_id,application_id);
    }

    @PostMapping("/addHiringInterview/{recuriter_id}/{application_id}")
    public HiringInterview addHiringIntervicw(HiringInterview hiringInterview,int recuriter_id,int application_id){
        return interviewService.addHiringInterview(hiringInterview,recuriter_id,application_id);
    }

    @GetMapping("/getTecknicalResult/{application_id}")
    public TechnicalInterview getTechincalInterviewResult(int application_id){
        return interviewService.getTechnincalInterview(application_id);
    }
    @GetMapping("/getScreeningInterviewResull/{application_id}")
    public ScreeningInterview getScreeningInterviewResult(int application_id){
        return interviewService.getScreeningInterview(application_id);
    }
    @GetMapping("/getHiringInterviewResult/{application_id}")
    public HiringInterview getHiringInterviewResult(int application_id){
        return interviewService.getHiringInterview(application_id);
    }
    @PutMapping("/updateTechnical/{interview_id}")
    public TechnicalInterview updateTechincalInterview(@RequestBody TechnicalInterview technicalInterview,@PathVariable int interview_id){
        return interviewService.updateTechinicalInterview(technicalInterview,interview_id);
    }
    @PutMapping("/updateScreening/{interview_id}")
    public ScreeningInterview updateScreeningInterview(@RequestBody ScreeningInterview screeningInterview,@PathVariable int interview_id){
        return interviewService.updateScreeenInterview(screeningInterview,interview_id);
    }
    @PutMapping("/updateHiring/{interview_id}")
    public HiringInterview updateHiringInterview(@RequestBody HiringInterview hiringInterview,@PathVariable int interview_id){
        return interviewService.updateHiringInterview(hiringInterview,interview_id);
    }
    @GetMapping("/getAllInterveiw/{application_id}")
    public List<Interview> getAllInterviews(@PathVariable int application_id){
        return null;
    }

    @GetMapping("/addScreenInterviewResult/{recuriter_id}/{application_id}")
    public ScreeningInterview addScreenInterviewResult(@RequestBody ScreeningInterview screeningInterview,@PathVariable int recuriter_id,@PathVariable int application_id){

        return interviewService.addScreeningInterview(screeningInterview,recuriter_id,application_id);
    }
    @GetMapping("/addTechnicalInterviewResult/{recuriter_id}/{application_id}")
    public TechnicalInterview addTechnicalInterviewResult(@RequestBody TechnicalInterview technicalInterview,@PathVariable int recuriter_id,@PathVariable int application_id){

        return interviewService.addTechnicalInterview(technicalInterview,recuriter_id,application_id);
    }
    @GetMapping("/addHiringInterviewResult/{recuriter_id}/{application_id}")
    public HiringInterview  addHiringInterviewResult(@RequestBody HiringInterview hiringInterview,@PathVariable int recuriter_id,@PathVariable int application_id){

        return interviewService.addHiringInterview(hiringInterview,recuriter_id,application_id);
    }
    @DeleteMapping("/deleteTecinical/{id}")
    public void deleteTechincal(@PathVariable int id) throws NotFoundException {
        interviewService.deleteTechnicalInterview(id);
    }
    @DeleteMapping("/deleteHiring/{id}")
    public void deleteHiring(@PathVariable int id) throws NotFoundException {
        interviewService.deleteHiring(id);
    }
    @DeleteMapping("/deleteScreening/{id}")
    public void deleteScreening(@PathVariable int id) throws NotFoundException {
        interviewService.deleteScreening(id);
    }

}
