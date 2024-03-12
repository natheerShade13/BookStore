package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import java.util.Date;

public class PaymentFactory {
    public static Payment createPayment(String paymentID, String orderID, double amount, Date paymentDate, String paymentMethod) {
        return new Payment.Builder()
                .paymentID(paymentID)
                .orderID(orderID)
                .amount(amount)
                .paymentDate(paymentDate)
                .paymentMethod(paymentMethod)
                .build();
    }
}
