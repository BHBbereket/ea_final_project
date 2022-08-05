package edu.miu.cs544.ea_final_project.entites.interview;

import javax.persistence.*;

@Entity
public class Questions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    @ManyToOne
    @JoinColumn(name = "interview_id",referencedColumnName = "id")
    private TechincalInterview technical_int;

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

    public TechincalInterview getTechnical_int() {
        return technical_int;
    }

    public void setTechnical_int(TechincalInterview technical_int) {
        this.technical_int = technical_int;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                '}';
    }
}
