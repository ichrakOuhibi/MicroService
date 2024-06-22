package com.example.article.Controller;

import com.example.article.Service.IArticleService;
import com.example.article.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/Article")

public class ArticleController {
    @Autowired
    private IArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAllTutorials() {
        return articleService.getAllArticle();

    }

    @PostMapping("/save")
    public Article save(@RequestBody Article article) {
        return articleService.addArticle(article);

    }

    @DeleteMapping("/delete/{id}")
    public void supprimer(@PathVariable("id") Long id) {
        articleService.deleteArticleById(id);

    }

    @GetMapping("/getbyid/{id}")
    public Article GetById(@PathVariable("id") Long id) {
        return articleService.getArticleById(id);
    }

    @PatchMapping("/update/{id}")
    public Article patchUpdateStock(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return articleService.updateArticle(id, updates);

    }

}
