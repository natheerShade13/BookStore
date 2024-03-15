package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;

/*

Author: Chadwin Kyle Fritz 218068360 15/03/2024

 */

public interface IPaymentRepository extends IRepository<Payment, String> {

    List<Payment> getAll();

}