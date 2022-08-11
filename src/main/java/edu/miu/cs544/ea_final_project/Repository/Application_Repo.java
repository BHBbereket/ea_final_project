package edu.miu.cs544.ea_final_project.Repository;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Job;
import edu.miu.cs544.ea_final_project.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Application_Repo extends JpaRepository<Application,Integer> {
    @Query(value = "select a from Application a where a.job=?1")
    public List<Application> findAllByJob(Job job);
    @Query(value = "select a from Application a where a.applicant=?1")
    public List<Application> findApplicationByApplicant(Person person);
}
