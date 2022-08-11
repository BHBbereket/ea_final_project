package edu.miu.cs544.ea_final_project.controller;

import edu.miu.cs544.ea_final_project.entities.Application;
import edu.miu.cs544.ea_final_project.entities.Person;
import edu.miu.cs544.ea_final_project.Repository.PersonRepository;
import edu.miu.cs544.ea_final_project.exceptions.NotFoundException;
import edu.miu.cs544.ea_final_project.servies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Person add(@RequestBody Person person)
    {
        return userService.add(person);
    }
    @PostMapping("/addApplication/{job_id}/{person_id}")
    public Application addApplication(@RequestBody Application application, @PathVariable int job_id,@PathVariable int person_id){
        return userService.addApplication(application,job_id,person_id);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) throws NotFoundException {
        userService.deleteUser(id);
    }
}
