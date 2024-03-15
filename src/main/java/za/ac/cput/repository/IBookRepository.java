package za.ac.cput.repository;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Order;

import java.util.List;

public interface IBookRepository extends IRepository<Book, String>{

    List<Book> getAll();

}
