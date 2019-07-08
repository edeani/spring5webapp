package guru.springframework.spring5wepapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5wepapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
