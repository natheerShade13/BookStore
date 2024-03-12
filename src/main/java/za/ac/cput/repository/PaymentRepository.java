package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentRepository implements IPaymentRepository {
    private static PaymentRepository repository = null;
    private Map<String, Payment> paymentMap;

    private PaymentRepository() {
        paymentMap = new HashMap<>();
    }

    public static PaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        paymentMap.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public Payment read(String paymentID) {
        return paymentMap.get(paymentID);
    }

    @Override
    public Payment update(Payment payment) {
        paymentMap.put(payment.getPaymentID(), payment);
        return payment;
    }

    @Override
    public boolean delete(String paymentID) {
        Payment paymentToDelete = read(paymentID);
        if (paymentToDelete != null) {
            paymentMap.remove(paymentID);
            return true;
        }
        return false;
    }

    @Override
    public List<Payment> getAll() {
        return new ArrayList<>(paymentMap.values());
    }
}
