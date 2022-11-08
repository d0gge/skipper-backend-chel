package com.tinkoff.skipper.repository;

import com.tinkoff.skipper.entity.MenteeInfoEntity;
import com.tinkoff.skipper.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);

    //заменить данный метод sql-запросом
    Optional<MenteeInfoEntity> findMenteeInfoById(Long id);


}
