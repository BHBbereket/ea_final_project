package edu.miu.cs544.ea_final_project.entities;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;

import javax.persistence.*;

@Entity

public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String state;
    private int zip;
    @OneToOne(mappedBy = "address",fetch = FetchType.LAZY)
    private Person applicant;
    @OneToOne(mappedBy = "address",fetch = FetchType.LAZY)
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



    public void setApplicant(Person applicant) {
        this.applicant = applicant;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getId() {
        return id;
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
