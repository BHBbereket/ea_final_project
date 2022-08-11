package edu.miu.cs544.ea_final_project.entities;

import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Application {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String resume_version;
    @ManyToOne
    @JoinColumn(name = "applicant_id",referencedColumnName = "id")
    private Person applicant;
    @OneToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @OneToOne(mappedBy = "application",cascade = CascadeType.ALL)
    private ScreeningInterview screeningInterview;
    @OneToOne(mappedBy = "application",cascade = CascadeType.ALL)
    private TechnicalInterview technicalInterview;
    @OneToOne(mappedBy = "application",cascade = CascadeType.ALL)
    private HiringInterview hiringInterview;

    public ScreeningInterview getScreeningInterview() {
        return screeningInterview;
    }

    public void setScreeningInterview(ScreeningInterview screeningInterview) {
        this.screeningInterview = screeningInterview;
    }

    public TechnicalInterview getTechnicalInterview() {
        return technicalInterview;
    }

    public void setTechnicalInterview(TechnicalInterview technicalInterview) {
        this.technicalInterview = technicalInterview;
    }

    public HiringInterview getHiringInterview() {
        return hiringInterview;
    }

    public void setHiringInterview(HiringInterview hiringInterview) {
        this.hiringInterview = hiringInterview;
    }

    public Person getApplicant() {
        return applicant;
    }



    public Application(LocalDate date, String resume_version) {
        this.date = date;
        this.resume_version = resume_version;
    }

    public Application() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getResume_version() {
        return resume_version;
    }

    public void setResume_version(String resume_version) {
        this.resume_version = resume_version;
    }

//    public Person getApplicant() {
//        return applicant;
//    }

    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Application{" +
                "date=" + date +
                ", resume_version='" + resume_version + '\'' +
                '}';
    }
}
