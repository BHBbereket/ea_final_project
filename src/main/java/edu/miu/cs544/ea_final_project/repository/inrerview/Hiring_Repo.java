package edu.miu.cs544.ea_final_project.repository.inrerview;

import edu.miu.cs544.ea_final_project.entites.interview.HiringInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hiring_Repo extends JpaRepository<HiringInterview,Integer> {
}
