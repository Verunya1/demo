package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository <User, Integer> {

}
