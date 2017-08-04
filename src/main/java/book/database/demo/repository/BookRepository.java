package book.database.demo.repository;


import book.database.demo.controllers.MyBook;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<MyBook,Long> {
}
