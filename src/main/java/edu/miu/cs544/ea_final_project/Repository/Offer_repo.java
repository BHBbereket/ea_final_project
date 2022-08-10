package edu.miu.cs544.ea_final_project.Repository;

import edu.miu.cs544.ea_final_project.entities.companyEntities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Offer_repo extends JpaRepository<Offer,Integer> {

}
