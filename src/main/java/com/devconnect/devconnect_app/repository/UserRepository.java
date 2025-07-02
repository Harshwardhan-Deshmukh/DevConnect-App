package com.devconnect.devconnect_app.repository;

import com.devconnect.devconnect_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
