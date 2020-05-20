package com.codeup.codeupspringexercises.repositories;

import com.codeup.codeupspringexercises.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}