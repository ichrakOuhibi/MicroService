package com.example.article.Service;

import com.example.article.entities.Article;
import com.example.article.repository.RepoArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private RepoArticle articleRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }
    @Override
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article updateArticle(Long id, Map<String, Object> article) {
        Article existingArticle = articleRepository.findById(id).get();

        if (existingArticle == null) {

            return null;
        }

        for (Map.Entry<String, Object> entry : article.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            try {
                Field field = existingArticle.getClass().getDeclaredField(key);
                field.setAccessible(true);
                field.set(existingArticle, value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return articleRepository.save(existingArticle);
    }

    @Override
    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);

    }
}
