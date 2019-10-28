package it.library.controller;

import it.library.dto.*;
import it.library.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppController {

    @Autowired
    private BookService bookService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private AdminService adminService;


    @RequestMapping("/")
    public String main() {
        return "SEVER ON";
    }


    /* BOOK */
    @RequestMapping(value = "/getStarBook", method = RequestMethod.GET)
    public List<Book> getStarBook() {
        List<Book> listBook = bookService.getStarBook();
        return listBook;
    }

    @RequestMapping(value = "/getAllBook", method = RequestMethod.GET)
    public List<Book> getAllBook() {
        List<Book> listBook = bookService.getAllBook();
        return listBook;
    }


    /* TYPE */
    @RequestMapping(value = "/getTypeOfBook", method = RequestMethod.GET)
    public List<Type> getTypes() {
        List<Type> listType = typeService.getAllTypes();
        return listType;
    }


    @RequestMapping(value = "/getInfoAuthor", method = RequestMethod.GET)
    public List<Author> getInfoAuthor() {
        return null;
    }


    /* ADMINISTRATOR */
    @RequestMapping(value = "/getAdmin", method = RequestMethod.POST)
    public Admin getAdmin(@RequestBody Admin admin) {
        Admin validateAdmin = adminService.getValidateAdmin(admin);
        return validateAdmin ;
    }
}
