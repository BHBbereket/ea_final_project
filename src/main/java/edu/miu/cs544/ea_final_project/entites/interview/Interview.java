package edu.miu.cs544.ea_final_project.entites.interview;

import edu.miu.cs544.ea_final_project.entites.Company.Recuriter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
}
