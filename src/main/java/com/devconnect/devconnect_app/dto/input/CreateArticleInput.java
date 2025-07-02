package com.devconnect.devconnect_app.dto.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateArticleInput {

    @NotBlank(message = "Article: title is an Required Field")
    @Length(min = 5, max = 15, message = "Article: Length of title should between range 5, 10")
    private String title;
    private String content;

    @NotBlank(message = "Article: authorId is an Required Field")
    private Integer authorId;
    private List<Integer> tagsIds;
}
