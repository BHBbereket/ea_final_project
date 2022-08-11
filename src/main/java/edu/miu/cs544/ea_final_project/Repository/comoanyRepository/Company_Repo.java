package edu.miu.cs544.ea_final_project.Repository.comoanyRepository;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Company;
import edu.miu.cs544.ea_final_project.entities.companyEntities.Recuriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Company_Repo extends JpaRepository<Company,Integer> {
    @Query(value = "select c from Company c where c.id=?1")
    public Recuriter findCompanyById(int id);
}
