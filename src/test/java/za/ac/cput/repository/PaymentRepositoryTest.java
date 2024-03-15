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

Author: Chadwin Kyle Fritz 218068360 15/03/2024

 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentRepositoryTest {

    private static IPaymentRepository repository = new PaymentRepository();

    private static final Payment paymentA = PaymentFactory.createPayment("987654", 500, new Date(), "Credit Card");

    private static final Payment paymentB = PaymentFactory.createPayment("456789", 1000, new Date(), "Debit Card");

    @Test
    @Order(1)
    void testCreatePaymentA() {
        Payment createdPayment = repository.create(paymentA);
        assertNotNull(createdPayment);
        assertEquals(paymentA, createdPayment);
        System.out.println("Created Payment A: " + createdPayment);
    }

    @Test
    @Order(2)
    void testCreatePaymentB() {
        Payment createdPayment = repository.create(paymentB);
        assertNotNull(createdPayment);
        assertEquals(paymentB, createdPayment);
        System.out.println("Created Payment B: " + createdPayment);
    }

    @Test
    @Order(3)
    void testReadPayment() {
        Payment readPaymentA = repository.read(paymentA.getPaymentID());
        assertNotNull(readPaymentA);
        assertEquals(paymentA, readPaymentA);
        System.out.println("Read Payment A: " + readPaymentA);

        Payment readPaymentB = repository.read(paymentB.getPaymentID());
        assertNotNull(readPaymentB);
        assertEquals(paymentB, readPaymentB);
        System.out.println("Read Payment B: " + readPaymentB);
    }

    @Test
    @Order(4)
    void testUpdatePayment() {
        Payment updatedPaymentA = new Payment.Builder()
                .paymentID(paymentA.getPaymentID())
                .amount(500)
                .paymentDate(new Date())
                .paymentMethod("Debit Card")
                .build();

        Payment updatedPaymentB = new Payment.Builder()
                .paymentID(paymentB.getPaymentID())
                .amount(1000)
                .paymentDate(new Date())
                .paymentMethod("Credit Card")
                .build();

        Payment resultA = repository.update(updatedPaymentA);
        assertNotNull(resultA);
        assertEquals(updatedPaymentA, resultA);
        System.out.println("Updated Payment A: " + resultA);

        Payment resultB = repository.update(updatedPaymentB);
        assertNotNull(resultB);
        assertEquals(updatedPaymentB, resultB);
        System.out.println("Updated Payment B: " + resultB);
    }

    @Test
    @Order(5)
    void testDeletePayment() {
        assertTrue(repository.delete(paymentA.getPaymentID()));
        System.out.println("Deleted Payment A: " + paymentA.getPaymentID());

        assertTrue(repository.delete(paymentB.getPaymentID()));
        System.out.println("Deleted Payment B: " + paymentB.getPaymentID());
    }

    @Test
    @Order(6)
    void testGetAllPayments() {
        repository.create(paymentA);
        repository.create(paymentB);
        assertNotNull(repository.getAll());
        System.out.println("All Payments: " + repository.getAll());
    }
}
