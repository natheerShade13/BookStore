package za.ac.cput.repository;

import za.ac.cput.domain.Book;

import java.util.List;

public interface IBookRepository extends IRepository<Book, String>{

    List<Book> getAll();

}
