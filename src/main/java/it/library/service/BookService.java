package it.library.service;

import it.library.dao.BookRepository;
import it.library.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getStarBook() {
        return bookRepository.getStar();
    }

    public List<Book> getAllBook() {
        return bookRepository.getBook();
    }
}
