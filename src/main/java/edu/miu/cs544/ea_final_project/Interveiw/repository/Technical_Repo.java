package edu.miu.cs544.ea_final_project.Interveiw.repository;

import edu.miu.cs544.ea_final_project.Interveiw.entities.TechincalInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Technical_Repo extends JpaRepository<TechincalInterview,Integer> {
}
