package edu.miu.cs544.ea_final_project.Repository.interviewrepository;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.ScreeningInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Screening_repo extends JpaRepository<ScreeningInterview,Integer> {
    @Query(value = "select s from ScreeningInterview  s where s.application=?1")
    public ScreeningInterview findScreeningInterviewByApplication(Application application);

}
