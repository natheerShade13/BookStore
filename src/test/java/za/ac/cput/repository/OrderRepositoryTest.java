package za.ac.cput.repository;
/*OrderRepository.java
Author: Motlalepula Mbali Kgatlhane
221684212
Date: 18 March 2024
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.OrderFactory;
import za.ac.cput.factory.PaymentFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderRepositoryTest {

    private static IOrderRepository repository = OrderRepository.getRepository();

    private Order order = OrderFactory.createOrder("123456", new Date(), 1000, "Shipped");


    @Test
    @Order(1)
    void create() {
        Order created = repository.create(order);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String orderID = order.getOrderID();
        Order read = repository.read(orderID);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
    }

    @Test
    @Order(5)
    void delete() {
    }

    @Test
    @Order(4)
    void getAll() {
    }
}
