package edu.miu.cs544.ea_final_project.repository.position_and_skill;

import edu.miu.cs544.ea_final_project.entites.position_and_application.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Integer> {
}
