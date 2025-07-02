package com.devconnect.devconnect_app.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCommentInput {
    private String content;
    private Integer authorId;
    private Integer parentQuestionId;
    private Integer parentArticleId;
}
