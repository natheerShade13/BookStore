package za.ac.cput.repository;
/*OrderRepositoryTest.java
Author: Motlalepula Mbali Kgatlhane
221684212
Date: 18 March 2024
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Order;
import za.ac.cput.factory.OrderFactory;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderRepositoryTest {
    private static IOrderRepository repository = OrderRepository.getRepository();

    private final Order order1 = OrderFactory.createOrder("12345",new Date(), 1500,"Order Shipped");

    @Test
    @org.junit.jupiter.api.Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    void create() {
        Order add  = repository.create(order1);
        assertNotNull(add);
        System.out.println(add);
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void read() {
        String orderID = order1.getOrderID();
        Order read = repository.read(orderID);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    void update() {
        Order newOrder = new Order.Builder().copy(order1).setTotalAmount(2000).build();
        Order update = repository.update(newOrder);
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    @org.junit.jupiter.api.Order(5)
    void delete() {
        assertTrue(repository.delete(order1.getOrderID()));
        System.out.println("Successfully deleted");
    }


}