package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/*
PaymentRepository.java
Payment repository test class
Author: Chadwin Kyle Fritz 218068360
https://github.com/ChadwinFritz
Date: 15/03/2024
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentRepositoryTest {

    private static IPaymentRepository repository = PaymentRepository.getRepository();

    private Payment paymentA = PaymentFactory.createPayment("987654", 500, new Date()
            , "Credit Card");

    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @Order(1)
    void create() {
        Payment add = repository.create(paymentA);
        assertNotNull(add);
        System.out.println(add);
    }

    @Test
    @Order(2)
    void read() {
        String paymentID = paymentA.getPaymentID();
        Payment read = repository.read(paymentID);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Payment newPayment = new Payment.Builder()
                .copy(paymentA)
                .setAmount(750)
                .build();
        Payment update = repository.update(newPayment);
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(paymentA.getPaymentID()));
        System.out.println("Successfully deleted");
    }
}
