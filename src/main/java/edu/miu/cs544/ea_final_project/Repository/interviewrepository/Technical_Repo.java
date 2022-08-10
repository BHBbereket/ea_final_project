package edu.miu.cs544.ea_final_project.Repository.interviewrepository;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.TechnicalInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Technical_Repo extends JpaRepository<TechnicalInterview,Integer> {
    @Query(value = "select t from TechnicalInterview t where t.application=?1")
    public TechnicalInterview findTechnicalInterviewByApplication(Application application);
}
