package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/*

Author: Chadwin Kyle Fritz 218068360
Date: 15/03/2024
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentFactoryTest {

    private final Payment paymentA = PaymentFactory.createPayment("987654", 500, new Date()
            , "Credit Card");

    private final Payment paymentB = PaymentFactory.createPayment(1000, new Date()
            , "Debit Card");

    @Test
    @Order(1)
    void testCreatePaymentA() {
        assertNotNull(paymentA);
        System.out.println(paymentA);
    }

    @Test
    @Order(2)
    void testCreatePaymentB() {
        assertNotNull(paymentB);
        System.out.println(paymentB);
    }
}
