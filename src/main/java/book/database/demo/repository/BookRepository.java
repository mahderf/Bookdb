package book.database.demo.repository;

import book.database.demo.controllers.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {
}
