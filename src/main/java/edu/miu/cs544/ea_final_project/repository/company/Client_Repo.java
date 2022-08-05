package edu.miu.cs544.ea_final_project.repository.company;

import edu.miu.cs544.ea_final_project.entites.Company.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Client_Repo extends JpaRepository<Client,Integer> {
}
