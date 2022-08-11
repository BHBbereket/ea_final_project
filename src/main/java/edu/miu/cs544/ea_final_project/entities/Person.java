package edu.miu.cs544.ea_final_project.entities;

import edu.miu.cs544.ea_final_project.entities.Address;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import edu.miu.cs544.ea_final_project.entities.Application;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "applicant_table")
public class Person implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    @OneToMany(mappedBy = "applicant",fetch = FetchType.EAGER)
    private List<Application> application;
    @OneToOne(mappedBy = "applicant")
    private Offer offer;

    @OneToOne(mappedBy = "applicant",cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, String email, String username, String password, List<Application> application) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.application = application;
    }

    public Person() {
    }

    public Offer getOffer() {
        return offer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Application> getApplication() {
        return application;
    }

    public void setApplication(List<Application> application) {
        this.application = application;
    }

    public Person(String name, String email, String username, String password, Address address) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
