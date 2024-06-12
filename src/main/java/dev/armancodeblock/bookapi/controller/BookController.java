package dev.armancodeblock.bookapi.controller;

import dev.armancodeblock.bookapi.entity.Book;
import dev.armancodeblock.bookapi.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
@GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
@PostMapping("/add")
  private String addBook(@RequestBody  Book book) {

        bookRepository.save(book);
        return "book added successfully";
  }
}
