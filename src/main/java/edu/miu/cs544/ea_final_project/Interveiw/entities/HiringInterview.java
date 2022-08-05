package edu.miu.cs544.ea_final_project.Interveiw.entities;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class HiringInterview extends Interview {
    private int team_size;
    private LocalDateTime starting_date;

    public HiringInterview(int team_size, LocalDateTime starting_date) {
        this.team_size = team_size;
        this.starting_date = starting_date;
    }

    public HiringInterview() {
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

    public LocalDateTime getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(LocalDateTime starting_date) {
        this.starting_date = starting_date;
    }
}
