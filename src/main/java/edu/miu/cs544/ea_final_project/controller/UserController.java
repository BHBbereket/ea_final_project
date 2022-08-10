package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Person;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private PersonRepository repository;

    @PostMapping("/add")
    public Person add(@RequestBody Person person)
    {
        return repository.save(person);
    }

}
