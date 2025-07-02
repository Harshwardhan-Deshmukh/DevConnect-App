package com.devconnect.devconnect_app.service;

import com.devconnect.devconnect_app.dto.input.CreateCommentInput;
import com.devconnect.devconnect_app.dto.input.UpdateCommentInput;
import com.devconnect.devconnect_app.dto.output.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> getAllComments();
    CommentDTO getComment(Integer id);
    CommentDTO createComment(CreateCommentInput createCommentInput);
    CommentDTO updateComment(UpdateCommentInput updateCommentInput);
    Boolean deleteComment(Integer id);
}
