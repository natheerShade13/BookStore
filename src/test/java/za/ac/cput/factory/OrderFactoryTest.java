package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Order;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

/*OrderFactoryTest.java
Author: Motlalepula Mbali Kgatlhane (221684212)
Date: 18 March 2024
https://github.com/Mbalsss/BookStore+
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderFactoryTest {
    private final Order order1 = OrderFactory.createOrder("12345", new Date(), 2000, "Order Received");

    private final Order order2 = OrderFactory.createOrder("",new Date(), 1500, "Order Shipped");


    @Test
    @org.junit.jupiter.api.Order(1)
    void createOrder() {
        assertNotNull(order1);
        System.out.println(order1);
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void testCreateOrderFail() {
        assertNotNull(order2);
        System.out.println(order2);
    }
}