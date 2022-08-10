package edu.miu.cs544.ea_final_project.Repository;

import edu.miu.cs544.ea_final_project.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
