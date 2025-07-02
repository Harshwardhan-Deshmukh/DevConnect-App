package com.devconnect.devconnect_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String bio;

    @OneToMany(mappedBy = "author")
    private List<CommentEntity> comments;

    @OneToMany(mappedBy = "author")
    private List<ArticleEntity> articles;

    @OneToMany(mappedBy = "author")
    private List<QuestionEntity> questions;

    @ManyToMany
    @JoinTable(
            name = "user_followers",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "following_id")
    )
    private List<UserEntity> following;

    @ManyToMany(mappedBy = "following")
    private List<UserEntity> followers;
}
