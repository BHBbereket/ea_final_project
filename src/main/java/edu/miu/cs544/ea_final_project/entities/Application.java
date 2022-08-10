package edu.miu.cs544.ea_final_project.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Application {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    private String resume_version;
    @ManyToOne
    @JoinColumn(name = "applicant_id",referencedColumnName = "id")
    private Person applicant;
    @OneToOne(mappedBy = "application")
    private Job job;

    public Application(LocalDateTime date, String resume_version) {
        this.date = date;
        this.resume_version = resume_version;
    }

    public Application() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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
