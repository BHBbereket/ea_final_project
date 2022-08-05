package edu.miu.cs544.ea_final_project.repository;

import edu.miu.cs544.ea_final_project.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRpository extends JpaRepository<Person,Integer> {
}
