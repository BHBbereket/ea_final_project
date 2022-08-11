package edu.miu.cs544.ea_final_project.entities.companyEntities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;

import javax.persistence.*;
import java.sql.ClientInfoStatus;
import java.util.List;

@Entity
@DiscriminatorValue(value = "recuriter")
public class Recuriter extends Company {
//    @Version
//    private int version;
    @JsonIgnore
    @OneToMany(mappedBy = "recuriter")
     private List<Client> clients;
    public Recuriter() {
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Recuriter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Recuriter{" +

                '}';
    }
}
