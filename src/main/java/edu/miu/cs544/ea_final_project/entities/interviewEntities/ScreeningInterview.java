package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import javax.persistence.Entity;

@Entity
public class ScreeningInterview extends Interview {
    private String name;
    private int result;

    public ScreeningInterview(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public ScreeningInterview() {
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
