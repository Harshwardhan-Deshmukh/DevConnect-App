package com.devconnect.devconnect_app.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Integer id;
    private String name;
    private String email;
    private String bio;

    private List<CommentDTO> comments;
    private List<ArticleDTO> articles;
    private List<QuestionDTO> questions;

    private List<UserBasicDTO> following;
    private List<UserBasicDTO> followers;
}
