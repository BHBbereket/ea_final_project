package edu.miu.cs544.ea_final_project.entities.interviewEntities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Questions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    @ManyToMany
    @JoinTable(
            name = "question_techincal",
            joinColumns = @JoinColumn(
                    name = "question_id"
            ),
            inverseJoinColumns = @JoinColumn(name = "tecbincal_id")
    )
    private List<TechnicalInterview> technicalInterviews;

    public Questions(String question) {
        this.question = question;
    }

    public Questions() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<TechnicalInterview> getTechnicalInterviews() {
        return technicalInterviews;
    }

    public void setTechnicalInterviews(List<TechnicalInterview> technicalInterviews) {
        this.technicalInterviews = technicalInterviews;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                '}';
    }
}
