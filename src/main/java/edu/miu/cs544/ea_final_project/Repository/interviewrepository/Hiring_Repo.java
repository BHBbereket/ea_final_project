package edu.miu.cs544.ea_final_project.Repository.interviewrepository;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.interviewEntities.HiringInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Hiring_Repo extends JpaRepository<HiringInterview,Integer> {

    @Query(value = "select h from HiringInterview h where h.application=?1")
    public HiringInterview findHiringInterviewByApplication(Application application);
}
