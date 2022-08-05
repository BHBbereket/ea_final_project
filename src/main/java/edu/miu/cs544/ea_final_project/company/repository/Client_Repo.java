package edu.miu.cs544.ea_final_project.company.repository;

import edu.miu.cs544.ea_final_project.company.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Client_Repo extends JpaRepository<Client,Integer> {
}
