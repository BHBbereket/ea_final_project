package edu.miu.cs544.ea_final_project.Interveiw.entities;

import javax.persistence.*;

@Entity
public class Questions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    @ManyToOne
    @JoinColumn(name = "interview_id",referencedColumnName = "id")
    private TechnicalInterview technical_int;

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

    public TechnicalInterview getTechnical_int() {
        return technical_int;
    }

    public void setTechnical_int(TechnicalInterview technical_int) {
        this.technical_int = technical_int;
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
