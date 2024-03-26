package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.util.Date;

/*
PaymentFactory.java
Payment factory class
Author: Chadwin Kyle Fritz 218068360
https://github.com/ChadwinFritz
Date: 15/03/2024
 */

public class PaymentFactory {

    public static Payment createPayment(String paymentID, double amount, Date paymentDate, String paymentMethod) {
        if (Helper.isNullOrEmpty(paymentID) || Helper.isNegative(amount) || Helper.isNull(paymentDate) || Helper.isNullOrEmpty(paymentMethod)) {
            return null;
        }

        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setPaymentMethod(paymentMethod)
                .build();
    }

    public static Payment createPayment(double amount, Date paymentDate, String paymentMethod) {
        if (Helper.isNegative(amount) || Helper.isNull(paymentDate) || Helper.isNullOrEmpty(paymentMethod)) {
            return null;
        }

        String generatedPaymentID = generatePaymentID();

        return new Payment.Builder()
                .setPaymentID(generatedPaymentID)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setPaymentMethod(paymentMethod)
                .build();
    }

    private static String generatePaymentID() {
        // Generate a random payment ID using UUID
        return Helper.generateID();
    }
}