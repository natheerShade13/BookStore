package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

/*
PaymentRepository.java
Payment repository class
Author: Chadwin Kyle Fritz 218068360
https://github.com/ChadwinFritz
Date: 15/03/2024
 */

public class PaymentRepository implements IPaymentRepository {

    private static IPaymentRepository repository = null;

    private List<Payment> paymentsList;

    private PaymentRepository() {
        paymentsList = new ArrayList<>();
    }

    public static IPaymentRepository getRepository() {
        if (repository == null)
            repository = new PaymentRepository();

        return repository;
    }

    @Override
    public List<Payment> getAll() {
        return paymentsList;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = paymentsList.add(payment);
        if (success) {
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String paymentID) {
        for (Payment payment : paymentsList) {
            if (payment.getPaymentID().equals(paymentID))
                return payment;
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        String id = payment.getPaymentID();
        Payment oldPayment = read(id);

        if (oldPayment == null) {
            return null;
        }
        boolean success = delete(id);
        if (success) {
            paymentsList.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String paymentID) {
        Payment paymentToDelete = read(paymentID);
        if (paymentToDelete == null) {
            return false;
        }
        return paymentsList.remove(paymentToDelete);
    }
}
