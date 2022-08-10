package edu.miu.cs544.ea_final_project.entities.companyEntities;

import edu.miu.cs544.ea_final_project.entities.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String declaration;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicant_id",referencedColumnName = "id")
    private Person applicant;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_Id",referencedColumnName = "id")
    private Client client;
    private LocalDate issued_date;

    public Offer() {

    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }


    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }


    public int getId() {
        return id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(LocalDate issued_date) {
        this.issued_date = issued_date;
    }

    public Offer(String declaration, LocalDate issued_date) {
        this.declaration = declaration;
        this.issued_date = issued_date;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "declaration='" + declaration + '\'' +
                ", issued_date=" + issued_date +
                '}';
    }
}
