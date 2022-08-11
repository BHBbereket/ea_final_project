package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.cs544.ea_final_project.entities.Application;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity

public class TechnicalInterview extends Interview {
    private Location location;
    private int duration;
    @JsonIgnore
    @ManyToMany(mappedBy = "technicalInterviews",cascade = CascadeType.ALL)
    private List<Questions> questions;

    public List<Questions> getQuestions() {
        return questions;
    }

    public TechnicalInterview(String phone, String email, LocalDate interviewDate, Location location, int duration) {
        super(phone, email, interviewDate);
        this.location = location;
        this.duration = duration;

    }

    @OneToOne
    @JoinColumn(name = "app_id",referencedColumnName = "id")
    private Application application;


    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public TechnicalInterview(Location location, int duration) {
        this.location = location;
        this.duration = duration;
    }

    public TechnicalInterview() {
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TechincalInterview{" +
                "location=" + location +
                ", duration=" + duration +
                '}';
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
