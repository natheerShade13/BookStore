package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.util.Date;

/*

Author: Chadwin Kyle Fritz 218068360 15/03/2024

 */

public class PaymentFactory {

    public static Payment createPayment(String paymentID, String orderID, double amount, Date paymentDate, String paymentMethod) {
        if (Helper.isNullOrEmpty(paymentID) || Helper.isNullOrEmpty(orderID) || Helper.isNegative(amount)
                || paymentDate == null || Helper.isNullOrEmpty(paymentMethod)) {
            return null;
        }

        return new Payment.Builder()
                .paymentID(paymentID)
                .orderID(orderID)
                .amount(amount)
                .paymentDate(paymentDate)
                .paymentMethod(paymentMethod)
                .build();
    }
}
