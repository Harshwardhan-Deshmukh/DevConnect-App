package com.devconnect.devconnect_app.service;

import com.devconnect.devconnect_app.dto.input.CreateQuestionInput;
import com.devconnect.devconnect_app.dto.input.UpdateQuestionInput;
import com.devconnect.devconnect_app.dto.output.QuestionDTO;

import java.util.List;

public interface QuestionService {
    List<QuestionDTO> getAllQuestions();
    QuestionDTO getQuestion(Integer id);
    QuestionDTO createQuestion(CreateQuestionInput createQuestionInput);
    QuestionDTO updateQuestion(UpdateQuestionInput updateQuestionInput);
    Boolean deleteQuestion(Integer id);
}
