package com.devconnect.devconnect_app.dto.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateQuestionInput {
    @NotBlank(message = "Question: title is an Required Field for performing Mutations")
    private String title;
    @NotBlank(message = "Question: content is an Required Field for performing Mutations")
    private String content;
    @NotBlank(message = "Question: authorId is an Required Field for performing Mutations")
    private Integer authorId;
    @NotBlank(message = "Question: tagIds is an Required Field for performing Mutations")
    private List<Integer> tagsIds;
}
