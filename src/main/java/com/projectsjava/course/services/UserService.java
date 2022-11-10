package com.projectsjava.course.services;

import com.projectsjava.course.entities.User;
import com.projectsjava.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }


    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public void insert(User obj){
        userRepository.save(obj);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
