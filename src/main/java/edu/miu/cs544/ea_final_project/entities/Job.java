package edu.miu.cs544.ea_final_project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Version
    private int version;
    private double salary;
    @ManyToOne
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    private Company company;
    @JsonIgnore
    @OneToOne(mappedBy = "job", cascade = CascadeType.DETACH,fetch = FetchType.LAZY)
    private Application application;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "job")
    private List<Skill> skills;


    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public Job() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
