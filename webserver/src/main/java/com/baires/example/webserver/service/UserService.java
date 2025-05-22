package com.baires.example.webserver.service;

import com.baires.example.webserver.domain.User;
import com.baires.example.webserver.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {

        return repository.createUser(user)
                .block();
    }


    public User getUser(Integer id) {
        return repository.getUser(id).block();
    }

    public List<User> getUsers() {
        return repository.getUsers().block();
    }
}
