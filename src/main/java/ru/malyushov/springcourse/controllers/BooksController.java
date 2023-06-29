package ru.malyushov.springcourse.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.malyushov.springcourse.dao.BookDAO;
import ru.malyushov.springcourse.models.Book;
import ru.malyushov.springcourse.models.Person;

@Controller
@RequestMapping("/books")
public class BooksController {
    private BookDAO bookDAO;

    @Autowired
    public BooksController(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", bookDAO.index());
        return "/books/index";
    }
    @GetMapping("/new")
    public String newPerson(Model model){
        model.addAttribute("books",new Book());
        return "books/new";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        // получичм одного человека по его id из DAO и пераддим на предтавлнеи
        model.addAttribute("person",bookDAO.show(id));
        return "books/show";
    }
}