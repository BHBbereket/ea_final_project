package edu.miu.cs544.ea_final_project.entites.interview;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class TechincalInterview extends Interview {
    private Location location;
    private int duration;
    @OneToMany(mappedBy = "technical_int")
    private List<Questions> questions;

    public TechincalInterview(Location location, int duration) {
        this.location = location;
        this.duration = duration;
    }

    public TechincalInterview() {
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
