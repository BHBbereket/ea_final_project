package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import edu.miu.cs544.ea_final_project.entities.Application;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class ScreeningInterview extends Interview {
    private String name;
    private int result;

    public ScreeningInterview(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public ScreeningInterview(String phone, String email, LocalDate interviewDate, String name, int result) {
        super(phone, email, interviewDate);
        this.name = name;
        this.result = result;
    }

    public ScreeningInterview() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ScreeningInterview{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
