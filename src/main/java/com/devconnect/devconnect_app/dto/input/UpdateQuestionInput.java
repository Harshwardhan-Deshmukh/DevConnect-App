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
public class UpdateQuestionInput {
    @NotBlank(message = "Question: id is an Required Field for performing Mutations")
    private Integer id;
    private String title;
    private String content;

    @NotBlank(message = "Question: tagIds is an Required Field for performing Mutations")
    private List<Integer> tagsIds;
}
