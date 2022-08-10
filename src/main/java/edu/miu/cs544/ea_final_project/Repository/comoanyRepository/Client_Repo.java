package edu.miu.cs544.ea_final_project.Repository.comoanyRepository;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Client_Repo extends JpaRepository<Client,Integer> {
    @Query("select c from Client c where c.id=?1")
    public Client findClientById(Integer id);
}
