package com.codeup.codeupspringexercises.repositories;

import com.codeup.codeupspringexercises.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByTitle(String title);
}