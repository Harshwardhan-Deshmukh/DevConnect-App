package com.devconnect.devconnect_app.repository;

import com.devconnect.devconnect_app.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
}
