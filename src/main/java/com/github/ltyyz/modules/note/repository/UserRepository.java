package com.github.ltyyz.modules.note.repository;

import com.github.ltyyz.modules.note.model.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {

}
