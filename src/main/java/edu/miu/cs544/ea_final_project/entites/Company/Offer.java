package edu.miu.cs544.ea_final_project.entites.Company;

import edu.miu.cs544.ea_final_project.entites.Person;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String declaration;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "applicant_id",referencedColumnName = "id")
    private Person applicant;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_Id",referencedColumnName = "id")
    private Client client;
    private LocalDateTime issued_date;

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public Person getApplicant() {
        return applicant;
    }

    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(LocalDateTime issued_date) {
        this.issued_date = issued_date;
    }

    public Offer(String declaration, LocalDateTime issued_date) {
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
