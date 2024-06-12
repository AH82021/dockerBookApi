package dev.armancodeblock.bookapi.repository;

import dev.armancodeblock.bookapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book,Integer> {

}
