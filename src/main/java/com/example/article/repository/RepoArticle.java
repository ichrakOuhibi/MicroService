package com.example.article.repository;

import com.example.article.entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoArticle extends MongoRepository<Article, Long> {
}
