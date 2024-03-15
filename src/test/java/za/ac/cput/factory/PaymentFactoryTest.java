package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/*

Author: Chadwin Kyle Fritz 218068360 15/03/2024

 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentFactoryTest {

    private final Payment paymentA = PaymentFactory.createPayment("987654", 500, new Date(), "Credit Card");

    private final Payment paymentB = PaymentFactory.createPayment("456789", 1000, new Date(), "Debit Card");

    @Test
    @Order(1)
    void testCreatePaymentA() {
        assertNotNull(paymentA);
        assertEquals("987654", paymentA.getPaymentID());
        assertEquals(500, paymentA.getAmount());
        assertEquals("Credit Card", paymentA.getPaymentMethod());
        System.out.println("Created Payment A: " + paymentA);
    }

    @Test
    @Order(2)
    void testCreatePaymentB() {
        assertNotNull(paymentB);
        assertEquals("456789", paymentB.getPaymentID());
        assertEquals(1000, paymentB.getAmount());
        assertEquals("Debit Card", paymentB.getPaymentMethod());
        System.out.println("Created Payment B: " + paymentB);
    }
}
