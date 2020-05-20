package com.codeup.codeupspringexercises.repositories;

import com.codeup.codeupspringexercises.model.Ad;
import com.codeup.codeupspringexercises.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
    Ad findByTitle(String title);
}