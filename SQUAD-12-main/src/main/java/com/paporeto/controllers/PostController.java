package com.paporeto.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paporeto.dto.PostDTO;
import com.paporeto.entities.Post;
import com.paporeto.services.PostService;

/**
 * Controlador REST para gerenciar operações relacionadas às postagens.
 */
@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    /**
     * Obtém detalhes de uma publicação pelo ID.
     * 
     * @param postId O ID da publicação.
     * @return Um ResponseEntity contendo o DTO da publicação e o status HTTP correspondente.
     */
    @GetMapping("/{postId}")
    public ResponseEntity<?> getPostById(@PathVariable int postId) {
        try {
            Optional<Post> postOptional = postService.getPostById(postId);
            if (postOptional.isPresent()) {
                Post post = postOptional.get();
                PostDTO postDTO = new PostDTO();
                postDTO.setPostId(post.getPostId());
                postDTO.setTitle(post.getTitle());
                postDTO.setContent(post.getContent());
                postDTO.setCreatedAt(post.getCreatedAt());
                return ResponseEntity.ok(postDTO);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                     .body("Nenhuma postagem encontrada com o ID fornecido");
            }
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
