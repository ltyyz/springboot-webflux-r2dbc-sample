package com.github.ltyyz.modules.note.service;

import com.github.ltyyz.modules.note.repository.UserRepository;
import com.github.ltyyz.modules.note.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private DatabaseClient databaseClient;

    @Autowired
    private UserRepository repository;

    public Flux<UserEntity> list() {
        return repository.findAll();
    }

    @Transactional
    public Mono<Void> save(UserEntity entity) {
//        return noteRepository.save(entity);

        // 如果是自定义ID，必须使用databaseClient#insert()，使用 repository#save() 会被认定为Update而非Insert
        return databaseClient.insert().into(UserEntity.class).using(entity).then();
    }
}
