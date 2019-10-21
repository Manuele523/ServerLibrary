package it.library.controller;

import it.library.dto.Author;
import it.library.dto.Book;
import it.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/")
    public String main() {
        return "SEVER ON";
    }

    @RequestMapping(value = "/getAdvisedBooks", method = RequestMethod.GET)
    public List<Book> getBooks() {

        List<Book> listBook = bookService.getAllBooks();
        return listBook;
    }

    @RequestMapping(value = "/getInfoAuthor", method = RequestMethod.GET)
    public List<Author> getInfoAuthor() {
        return null;
    }

}
