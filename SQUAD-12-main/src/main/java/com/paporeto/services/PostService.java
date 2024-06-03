package com.paporeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paporeto.entities.Post;
import com.paporeto.repositories.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    /**
     * Obtém uma postagem pelo ID.
     * 
     * @param postId O ID da postagem a ser obtida.
     * @return Um Optional contendo a postagem, se encontrada.
     *         Caso contrário, retorna um Optional vazio.
     * @throws IllegalArgumentException Se o postId for nulo.
     */
    public Optional<Post> getPostById(Integer postId) {
        // Verifica se o postId é nulo
        if (postId == null) {
            throw new IllegalArgumentException("O postId não pode ser nulo.");
        }

        // Busca a postagem pelo ID usando o método findById do PostRepository
        return postRepository.findById(postId);
    }
}
