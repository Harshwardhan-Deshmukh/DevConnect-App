package com.devconnect.devconnect_app.repository;

import com.devconnect.devconnect_app.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
}
