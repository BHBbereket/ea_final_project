package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Interview {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String email;
    private LocalDate interviewDate;
    @ManyToOne
    @JoinColumn(name = "recuriter_id", referencedColumnName = "id")
    private Recuriter recuriter;
    @OneToOne
    @JoinColumn(name = "app_id",referencedColumnName = "id")
    private Application application;

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Recuriter getRecuriter() {
        return recuriter;
    }

    public void setRecuriter(Recuriter recuriter) {
        this.recuriter = recuriter;
    }

    public int getId() {
        return id;
    }

    public Interview() {
    }

    public Interview(String phone, String email, LocalDate interviewDate) {
        this.phone = phone;
        this.email = email;
        this.interviewDate = interviewDate;
    }
}
