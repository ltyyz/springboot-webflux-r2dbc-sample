package com.github.ltyyz.modules.note.controller;

import com.github.ltyyz.modules.note.service.UserService;
import com.github.ltyyz.modules.note.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/")
    public Flux<UserEntity> list() {
        return service.list();
    }

    @PostMapping("/user/")
    public Mono<Void> save(UserEntity entity) {
        return service.save(entity);
    }
}
