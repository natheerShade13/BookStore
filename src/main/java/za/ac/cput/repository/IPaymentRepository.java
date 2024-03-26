package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.List;

/*
IPaymentRepository.java
Payment repository interface
Author: Chadwin Kyle Fritz 218068360
https://github.com/ChadwinFritz
Date: 15/03/2024
 */

public interface IPaymentRepository extends IRepository<Payment, String> {

    List<Payment> getAll();

}