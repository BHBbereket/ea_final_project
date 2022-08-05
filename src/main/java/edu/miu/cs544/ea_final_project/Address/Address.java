package edu.miu.cs544.ea_final_project.Address;

import edu.miu.cs544.ea_final_project.company.entities.Company;
import edu.miu.cs544.ea_final_project.User.Person;

import javax.persistence.*;

@Entity

public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String state;
    private int zip;
    @OneToOne(mappedBy = "address")
    private Person applicant;
    @OneToOne(mappedBy = "address")
    private Company company;

    public Address(String city, String state, int zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Person getApplicant() {
        return applicant;
    }

    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
