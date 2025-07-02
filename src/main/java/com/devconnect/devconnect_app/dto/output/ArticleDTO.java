package com.devconnect.devconnect_app.dto.output;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticleDTO {
    private Integer id;
    private String title;
    private String content;

    private UserBasicDTO author;
    private List<TagBasicDTO> tags;
    private List<CommentDTO> comments;
}
