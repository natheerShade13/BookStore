package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.List;

/*
Customer.java
Customer model class
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

public interface ICustomerRepository extends IRepository<Customer, String>{

    List<Customer> getAll();

}
