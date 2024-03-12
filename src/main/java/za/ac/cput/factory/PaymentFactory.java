package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

import java.util.Date;

// PaymentFactory.java
public class PaymentFactory {
    public static Payment createPayment(String paymentID, String orderID, double amount, Date paymentDate, String paymentMethod) {
        return new Payment(paymentID, orderID, amount, paymentDate, paymentMethod);
    }
}
