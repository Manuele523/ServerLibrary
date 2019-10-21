package it.library.dao;


import it.library.dto.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(value = "SELECT * FROM book", nativeQuery = true)
    public List<Book> getBooks();

}
