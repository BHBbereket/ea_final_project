package edu.miu.cs544.ea_final_project.possithion_and_application.repository;

import edu.miu.cs544.ea_final_project.possithion_and_application.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer> {
    @Query("select j from Job  j where j.id=?1")
    public Job findJobById(int id);
}
