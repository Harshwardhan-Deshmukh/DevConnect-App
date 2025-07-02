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
public class QuestionDTO {
    private Integer id;
    private String title;
    private String content;

    private UserBasicDTO author;
    private List<CommentDTO> comments;
    private List<TagBasicDTO> tags;
}
