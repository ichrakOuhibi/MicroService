package com.example.article.Service;

import com.example.article.entities.Article;

import java.util.List;
import java.util.Map;

public interface IArticleService {
    Article addArticle(Article article);

    Article updateArticle(Long id, Map<String, Object> article);

    List<Article> getAllArticle();

    Article getArticleById(Long id);

    void deleteArticleById(Long id);
}
