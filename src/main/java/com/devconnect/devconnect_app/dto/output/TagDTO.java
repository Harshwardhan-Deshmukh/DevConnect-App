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
public class TagDTO {
    private Integer id;
    private String name;
    private List<QuestionDTO> questions;
    private List<ArticleDTO> articles;
}
