package com.devconnect.devconnect_app.dto.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCommentInput {
    @NotBlank(message = "Comment: content is an Required Field for performing Mutations")
    private String content;

    @NotBlank(message = "Comment: authorId is an Required Field for performing Mutations")
    private Integer authorId;

    private Integer parentQuestionId;
    private Integer parentArticleId;
}
