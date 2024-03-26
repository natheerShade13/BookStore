package za.ac.cput.repository;

import za.ac.cput.domain.Book;
import java.util.List;

/*
IBookRepository.java
Book repository interface
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */

public interface IBookRepository extends IRepository<Book, String>{

    List<Book> getAll();

}
