package edu.miu.cs544.ea_final_project.repository.inrerview;

import edu.miu.cs544.ea_final_project.entites.interview.TechincalInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Technical_Repo extends JpaRepository<TechincalInterview,Integer> {
}
