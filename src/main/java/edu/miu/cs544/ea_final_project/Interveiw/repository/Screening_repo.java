package edu.miu.cs544.ea_final_project.Interveiw.repository;

import edu.miu.cs544.ea_final_project.Interveiw.entities.ScreeningInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Screening_repo extends JpaRepository<ScreeningInterview,Integer> {
}
