package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;

// IPaymentRepository.java
public interface IPaymentRepository {
    List<Payment> getAll();
    Payment create(Payment payment);
    Payment read(String paymentID);
    Payment update(Payment payment);
    boolean delete(String paymentID);
}
