package edu.miu.cs544.ea_final_project.possithion_and_application.repository;

import edu.miu.cs544.ea_final_project.possithion_and_application.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Applicaion_Repo extends JpaRepository<Application,Integer> {
}
