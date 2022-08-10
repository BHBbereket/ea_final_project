package edu.miu.cs544.ea_final_project.Repository;

import edu.miu.cs544.ea_final_project.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Application_Repo extends JpaRepository<Application,Integer> {
}
