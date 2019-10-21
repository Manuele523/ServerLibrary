package it.library.controller;

import it.library.dto.Author;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppController {
//List<Book>

    @RequestMapping("/")
    public String main() {
        return "SEVER ON";
    }

    @RequestMapping(value = "/getAdvisedBooks", method = RequestMethod.GET)
    public String getBooks() {
        System.out.println("ECCOMI /getAdvisedBooks");
        return "STRING";
    }

    @RequestMapping(value = "/getInfoAuthor", method = RequestMethod.GET)
    public List<Author> getInfoAuthor() {
        return null;
    }

}
