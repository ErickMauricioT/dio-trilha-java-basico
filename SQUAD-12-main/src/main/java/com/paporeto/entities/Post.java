package com.paporeto.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade que representa uma postagem.
 */
@Entity
@Table(name = "posts")
public class Post {

    /**
     * Identificador único da postagem.
     * Gerado automaticamente pela estratégia IDENTITY.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    /**
     * Título da postagem.
     */
    private String title;

    /**
     * Conteúdo da postagem.
     */
    private String content;

    /**
     * Data de criação da postagem.
     */
    private Date createdAt;

    // Getters e setters

    /**
     * Obtém o ID da postagem.
     * 
     * @return ID da postagem.
     */
    public int getPostId() {
        return postId;
    }

    /**
     * Define o ID da postagem.
     * 
     * @param postId ID da postagem.
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     * Obtém o título da postagem.
     * 
     * @return Título da postagem.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o título da postagem.
     * 
     * @param title Título da postagem.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtém o conteúdo da postagem.
     * 
     * @return Conteúdo da postagem.
     */
    public String getContent() {
        return content;
    }

    /**
     * Define o conteúdo da postagem.
     * 
     * @param content Conteúdo da postagem.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Obtém a data de criação da postagem.
     * 
     * @return Data de criação da postagem.
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Define a data de criação da postagem.
     * 
     * @param createdAt Data de criação da postagem.
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
