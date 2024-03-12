package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PaymentRepository.java
public class PaymentRepository implements IPaymentRepository {
    private static final Map<String, Payment> paymentDatabase = new HashMap<>();

    @Override
    public List<Payment> getAll() {
        return new ArrayList<>(paymentDatabase.values());
    }

    @Override
    public Payment create(Payment payment) {
        paymentDatabase.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public Payment read(String paymentID) {
        return paymentDatabase.get(paymentID);
    }

    @Override
    public Payment update(Payment payment) {
        paymentDatabase.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public boolean delete(String paymentID) {
        if (paymentDatabase.containsKey(paymentID)) {
            paymentDatabase.remove(paymentID);
            return true;
        }
        return false;
    }
}
