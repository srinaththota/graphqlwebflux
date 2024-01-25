package com.reactivestreams.application.service;

import com.reactivestreams.application.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
List<User> usersList= Arrays.asList(User.builder().name("abc").id("1").build(),
        User.builder().name("def").id("2").build());
    public Flux<User> users(){
        return Flux.fromIterable(usersList);
    }
}
