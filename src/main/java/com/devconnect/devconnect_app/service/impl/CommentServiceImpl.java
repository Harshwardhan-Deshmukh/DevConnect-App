package com.devconnect.devconnect_app.service.impl;

import com.devconnect.devconnect_app.dto.input.CreateCommentInput;
import com.devconnect.devconnect_app.dto.input.UpdateCommentInput;
import com.devconnect.devconnect_app.dto.output.CommentDTO;
import com.devconnect.devconnect_app.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public List<CommentDTO> getAllComments() {
        return List.of();
    }

    @Override
    public CommentDTO getComment(Integer id) {
        return null;
    }

    @Override
    public CommentDTO createComment(CreateCommentInput createCommentInput) {
        return null;
    }

    @Override
    public CommentDTO updateComment(UpdateCommentInput updateCommentInput) {
        return null;
    }

    @Override
    public Boolean deleteComment(Integer id) {
        return null;
    }
}
