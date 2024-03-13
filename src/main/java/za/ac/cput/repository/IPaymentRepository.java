package za.ac.cput.repository;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Payment;

import java.util.List;

public interface IPaymentRepository extends IRepository<Payment, String> {

    List<Book> getAll();

}
