package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Book;
import static org.junit.jupiter.api.Assertions.*;

/*
BookFactoryTest.java
Book factory test class
Author: Natheer Shade 217159109
https://github.com/natheerShade13
Date: 13/03/2024
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookFactoryTest {

    private final Book b1 = BookFactory.buildBook("647389578", "Jujutsu Kaisen", "Natheer"
            , "Fantasy", 1500, 3);


    private final Book b2 = BookFactory.buildBook("","Solo Leveling", "Natheer"
            , "Fantasy", 500, 10);

    @Test
    @Order(1)
    void testBuildBook() {
        assertNotNull(b1);
        System.out.println(b1);
    }

    @Test
    @Order(2)
    void testBuildBookFail() {
        assertNotNull(b2);
        System.out.println(b2);
    }
}