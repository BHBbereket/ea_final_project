package edu.miu.cs544.ea_final_project.repository;

import edu.miu.cs544.ea_final_project.entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
