package com.codeup.codeupspringexercises.repositories;

import com.codeup.codeupspringexercises.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPubYear(int year);
    long deleteByAuthor(String author);

}