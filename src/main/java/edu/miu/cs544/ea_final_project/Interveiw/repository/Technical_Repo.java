package edu.miu.cs544.ea_final_project.Interveiw.repository;

import edu.miu.cs544.ea_final_project.Interveiw.entities.TechnicalInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Technical_Repo extends JpaRepository<TechnicalInterview,Integer> {
}
