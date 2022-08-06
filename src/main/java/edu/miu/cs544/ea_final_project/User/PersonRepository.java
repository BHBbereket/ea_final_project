package edu.miu.cs544.ea_final_project.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    @Query("select p from Person  p where p.id=?1")
    public Person findPersonById(Integer id);
}
