package edu.miu.cs544.ea_final_project.Repository.comoanyRepository;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Company_Repo extends JpaRepository<Company,Integer> {
}
