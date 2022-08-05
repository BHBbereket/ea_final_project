package edu.miu.cs544.ea_final_project.Interveiw.repository;

import edu.miu.cs544.ea_final_project.Interveiw.entities.HiringInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hiring_Repo extends JpaRepository<HiringInterview,Integer> {
}
