package edu.miu.cs544.ea_final_project.repository.inrerview;

import edu.miu.cs544.ea_final_project.entites.interview.ScreeningInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Screening_repo extends JpaRepository<ScreeningInterview,Integer> {
}
