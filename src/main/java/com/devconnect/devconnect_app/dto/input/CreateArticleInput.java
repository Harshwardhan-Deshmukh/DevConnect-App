package com.devconnect.devconnect_app.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateArticleInput {
    private String title;
    private String content;
    private Integer authorId;
    private List<Integer> tagsIds;
}
