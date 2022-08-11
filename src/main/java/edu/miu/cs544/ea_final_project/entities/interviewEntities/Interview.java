package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Interview {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String email;
    private LocalDate interviewDate;

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
