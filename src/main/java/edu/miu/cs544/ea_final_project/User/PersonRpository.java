package edu.miu.cs544.ea_final_project.User;

import edu.miu.cs544.ea_final_project.User.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRpository extends JpaRepository<Person,Integer> {
}
