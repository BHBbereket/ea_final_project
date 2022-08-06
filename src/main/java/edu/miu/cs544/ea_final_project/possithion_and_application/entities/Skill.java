package edu.miu.cs544.ea_final_project.possithion_and_application.entities;

import javax.persistence.*;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String language;
    private String name;
    private int expreince;
    @ManyToOne
    @JoinColumn(name = "job_id",referencedColumnName = "id")
    private Job job;

    public Skill(String description, String language, String name, int expreince) {
        this.description = description;
        this.language = language;
        this.name = name;
        this.expreince = expreince;
    }

    public Skill(String description, String language, String name, int expreince, Job job) {
        this.description = description;
        this.language = language;
        this.name = name;
        this.expreince = expreince;
        this.job = job;
    }

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpreince() {
        return expreince;
    }

    public void setExpreince(int expreince) {
        this.expreince = expreince;
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
        return "Skill{" +
                "description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                ", expreince=" + expreince +
                '}';
    }
}
