package com.devconnect.devconnect_app.service.impl;

import com.devconnect.devconnect_app.dto.input.CreateArticleInput;
import com.devconnect.devconnect_app.dto.input.UpdateArticleInput;
import com.devconnect.devconnect_app.dto.output.ArticleDTO;
import com.devconnect.devconnect_app.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public List<ArticleDTO> getAllArticles() {
        return List.of();
    }

    @Override
    public ArticleDTO getArticle(Integer id) {
        return null;
    }

    @Override
    public ArticleDTO createArticle(CreateArticleInput createArticleInput) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(UpdateArticleInput updateArticleInput) {
        return null;
    }

    @Override
    public Boolean deleteArticle(Integer id) {
        return null;
    }
}
