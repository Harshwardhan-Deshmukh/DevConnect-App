package com.devconnect.devconnect_app.service;

import com.devconnect.devconnect_app.dto.input.CreateArticleInput;
import com.devconnect.devconnect_app.dto.input.UpdateArticleInput;
import com.devconnect.devconnect_app.dto.output.ArticleDTO;

import java.util.List;

public interface ArticleService {
    List<ArticleDTO> getAllArticles();
    ArticleDTO getArticle(Integer id);
    ArticleDTO createArticle(CreateArticleInput createArticleInput);
    ArticleDTO updateArticle(UpdateArticleInput updateArticleInput);
    Boolean deleteArticle(Integer id);
}
