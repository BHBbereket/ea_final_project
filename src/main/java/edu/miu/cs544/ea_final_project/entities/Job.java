package edu.miu.cs544.ea_final_project.entities;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Job implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double salary;
    @ManyToOne
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    private Company company;
    @OneToMany(mappedBy = "job", cascade = CascadeType.DETACH,fetch = FetchType.LAZY)
    private List<Application> applications;
    @OneToMany(mappedBy = "job")
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

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
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
