package edu.miu.cs544.ea_final_project.repository.position_and_skill;

import edu.miu.cs544.ea_final_project.entites.position_and_application.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JopRepo extends JpaRepository<Job,Integer> {
}
