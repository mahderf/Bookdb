package book.database.demo.controllers;

import book.database.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.awt.print.Book;

@Controller
public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String showIndex(Model model)
    {

        String myMessage = "Welcome to the Bookstore";
        model.addAttribute( "message",myMessage);
        return "index";
    }

    @GetMapping("/addBook")
    public String addBooks(Model model)
    {
        model.addAttribute("newBook", new MyBook());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String postBook(@Valid @ModelAttribute("newBook") MyBook otherBook, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "addBook";
        }

       bookRepository.save(otherBook);
        return "result";

    }
  @GetMapping("/showallbooks")
    public @ResponseBody Iterable<MyBook>getAllUsers()
  {
      return bookRepository.findAll();
  }

}
