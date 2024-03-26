package za.ac.cput.factory;
/*OrderFactoryTest.java
Author: Motlalepula Mbali Kgatlhane (221684212)
Date: 18 March 2024
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Order;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderFactoryTest {

    @Test
    @org.junit.jupiter.api.Order(1)
    void testCreateOrder() {
        Order order = OrderFactory.createOrder("12345", new Date(), 2000, "Order Received");
        assertNotNull(order);
        System.out.println(order.toString());
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void testCreateOrderWithFail() {
        Order order = OrderFactory.createOrder("", new Date(), 2000, "Order Received");
        assertNotNull(order);
        System.out.println(order.toString());
    }


}