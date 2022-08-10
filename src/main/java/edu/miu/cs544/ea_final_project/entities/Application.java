package edu.miu.cs544.ea_final_project.entities;

import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Application {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String resume_version;
    @ManyToOne
    @JoinColumn(name = "applicant_id",referencedColumnName = "id")
    private Person applicant;
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @OneToOne(mappedBy = "application")
    private Interview interview;

    public Person getApplicant() {
        return applicant;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
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
