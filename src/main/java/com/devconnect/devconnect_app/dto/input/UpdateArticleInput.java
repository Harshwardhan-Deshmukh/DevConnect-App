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
public class UpdateArticleInput {
    @NotBlank(message = "Article: id is an Required Field for performing Mutations")
    private Integer id;

    @Length(min = 5, max = 15, message = "Article: Length of title should between range 5, 10")
    private String title;
    private String content;

    @NotBlank(message = "Article: tagIds is an Required Field for performing Mutations")
    private List<Integer> tagsIds;
}
