package edu.miu.cs544.ea_final_project.Interveiw.entities;

import edu.miu.cs544.ea_final_project.company.entities.Recuriter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Interview {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String email;
    private LocalDateTime interviewDate;
    @ManyToOne
    @JoinColumn(name = "recuriter_id", referencedColumnName = "id")
    private Recuriter recuriter;

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

    public LocalDateTime getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDateTime interviewDate) {
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

    public Interview(String phone, String email, LocalDateTime interviewDate) {
        this.phone = phone;
        this.email = email;
        this.interviewDate = interviewDate;
    }
}
