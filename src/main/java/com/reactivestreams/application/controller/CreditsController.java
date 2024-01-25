package com.reactivestreams.application.controller;

import com.reactivestreams.application.model.User;
import com.reactivestreams.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class CreditsController {

    @Autowired
    UserService userService;
    @QueryMapping
    public Mono<String> sayHello(){
        return Mono.just("hello world");
    }

    @QueryMapping
    public Flux<User> getUsers(){
        System.out.println("checking");
        return userService.users();
    }

}
