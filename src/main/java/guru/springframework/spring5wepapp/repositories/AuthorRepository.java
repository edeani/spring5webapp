package guru.springframework.spring5wepapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5wepapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
