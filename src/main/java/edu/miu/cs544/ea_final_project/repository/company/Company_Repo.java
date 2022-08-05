package edu.miu.cs544.ea_final_project.repository.company;

import edu.miu.cs544.ea_final_project.entites.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Company_Repo extends JpaRepository<Company,Integer> {
}
