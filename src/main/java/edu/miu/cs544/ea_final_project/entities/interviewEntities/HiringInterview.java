package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import edu.miu.cs544.ea_final_project.entities.Application;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class HiringInterview extends Interview {
    private int team_size;
    private LocalDate starting_date;

    public HiringInterview(int team_size, LocalDate starting_date) {
        this.team_size = team_size;
        this.starting_date = starting_date;
    }

    public HiringInterview(String phone, String email, LocalDate interviewDate, int team_size, LocalDate starting_date) {
        super(phone, email, interviewDate);
        this.team_size = team_size;
        this.starting_date = starting_date;
    }

    public HiringInterview() {
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

    public int getTeam_size() {
        return team_size;
    }

    public void setTeam_size(int team_size) {
        this.team_size = team_size;
    }

    @Override
    public String toString() {
        return "HiringInterview{" +
                "team_size=" + team_size +
                ", starting_date=" + starting_date +
                '}';
    }

    public LocalDate getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(LocalDate starting_date) {
        this.starting_date = starting_date;
    }
}
