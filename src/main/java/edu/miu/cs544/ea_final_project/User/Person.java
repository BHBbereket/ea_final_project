package edu.miu.cs544.ea_final_project.User;

import edu.miu.cs544.ea_final_project.Address.Address;
import edu.miu.cs544.ea_final_project.company.entities.Offer;
import edu.miu.cs544.ea_final_project.possithion_and_application.entities.Application;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "applicant_table")
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "applicant",fetch = FetchType.EAGER)
    private List<Application> application;
    @OneToOne(mappedBy = "applicant")
    private Offer offer;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id",referencedColumnName = "id")
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
