package edu.miu.cs544.ea_final_project.company.repository;

import edu.miu.cs544.ea_final_project.company.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Company_Repo extends JpaRepository<Company,Integer> {
}
