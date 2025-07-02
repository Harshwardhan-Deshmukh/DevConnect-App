package com.devconnect.devconnect_app.service.impl;

import com.devconnect.devconnect_app.dto.input.CreateQuestionInput;
import com.devconnect.devconnect_app.dto.input.UpdateQuestionInput;
import com.devconnect.devconnect_app.dto.output.QuestionDTO;
import com.devconnect.devconnect_app.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<QuestionDTO> getAllQuestions() {
        return List.of();
    }

    @Override
    public QuestionDTO getQuestion(Integer id) {
        return null;
    }

    @Override
    public QuestionDTO createQuestion(CreateQuestionInput createQuestionInput) {
        return null;
    }

    @Override
    public QuestionDTO updateQuestion(UpdateQuestionInput updateQuestionInput) {
        return null;
    }

    @Override
    public Boolean deleteQuestion(Integer id) {
        return null;
    }
}
