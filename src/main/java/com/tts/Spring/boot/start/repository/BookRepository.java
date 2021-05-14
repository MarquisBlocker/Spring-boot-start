package com.tts.Spring.boot.start.repository;

import com.tts.Spring.boot.start.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Long aligns with your ID type for your entity
//the repository needs to have its ID type defined, otherwise it will not work.
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
