package edu.miu.cs544.ea_final_project.company.repository;

import edu.miu.cs544.ea_final_project.company.entities.Recuriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recuriter_Repo extends JpaRepository<Recuriter,Integer> {
}
