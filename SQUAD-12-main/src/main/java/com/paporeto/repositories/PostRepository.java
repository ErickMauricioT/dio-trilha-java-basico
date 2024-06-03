package com.paporeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paporeto.entities.Post;

/**
 * Repositório para a entidade Post.
 * 
 * Esta interface herda de JpaRepository, fornecendo métodos CRUD padrão para a entidade Post.
 * O Spring Data JPA gerará automaticamente a implementação dessa interface em tempo de execução.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
