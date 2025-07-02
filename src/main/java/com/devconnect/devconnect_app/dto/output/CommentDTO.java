package com.devconnect.devconnect_app.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentDTO {

    private Integer id;
    private String content;
    private UserBasicDTO userDTO;

    private Integer parentArticleId;
    private Integer parentQuestionId;

}
