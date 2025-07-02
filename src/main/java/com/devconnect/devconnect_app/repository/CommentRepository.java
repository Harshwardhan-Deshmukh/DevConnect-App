package com.devconnect.devconnect_app.repository;

import com.devconnect.devconnect_app.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}
