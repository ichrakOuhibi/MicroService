package com.example.article.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Article")
public class Article {

    @Id
    private Long idArticle;
    String Description;
    String nomArticle;

    public Long getId() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
    public Article(Long idArticle, String description, String nomArticle) {
        super();
        this.idArticle = idArticle;
        this.Description = description;
        this.nomArticle = nomArticle;
    }
}