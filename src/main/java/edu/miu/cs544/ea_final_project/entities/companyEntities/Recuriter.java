package edu.miu.cs544.ea_final_project.entities.companyEntities;

import edu.miu.cs544.ea_final_project.entities.interviewEntities.Interview;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue(value = "recuriter")
public class Recuriter extends Company {
    @OneToMany(mappedBy = "recuriter")
    private List<Interview> interviews;

    public Recuriter(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public Recuriter() {
    }

    public Recuriter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Recuriter{" +
                "interviews=" + interviews +
                '}';
    }
}
