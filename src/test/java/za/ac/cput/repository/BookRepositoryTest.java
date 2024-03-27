package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Book;
import za.ac.cput.factory.BookFactory;
import static org.junit.jupiter.api.Assertions.*;

/*
BookRepository.java
Book repository test class
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookRepositoryTest {

    private static IBookRepository repository = BookRepository.getRepository();

    private Book b1 = BookFactory.buildBook("263850682", "The Gentlemen", "Natheer"
            , "Action", 2000, 5);

    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @Order(1)
    void create() {
        Book add = repository.create(b1);
        assertNotNull(add);
        System.out.println(add);
    }

    @Test
    @Order(2)
    void read() {
        String bookID = b1.getBookID();
        Book read = repository.read(bookID);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Book newBook = new Book.Builder().copy(b1).setStockQaunt(0).build();
        Book update = repository.update(newBook);
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(b1.getBookID()));
        System.out.println("Successfully deleted");
    }
}