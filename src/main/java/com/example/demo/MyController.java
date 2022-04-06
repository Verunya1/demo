package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    UserRepository repository;

@GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam Integer age){

    User user =new User();
    user.setName(name);
    user.setAge(age);
    repository.save(user);
    return "Saved successefull!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAll(){
    return repository.findAll();
    }
}
