package com.baires.example.webserver.repository;

import com.baires.example.webserver.domain.User;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserRepository {

    Mono<User> getUser(Integer id);

    Mono<User> createUser(User user);

    Mono<List<User>> getUsers();
}