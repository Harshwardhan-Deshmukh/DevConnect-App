package com.devconnect.devconnect_app.repository;

import com.devconnect.devconnect_app.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Integer> {
}
