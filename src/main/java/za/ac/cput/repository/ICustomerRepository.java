package za.ac.cput.repository;
/*
ICustomerRepository.java
ICustomerRepository interface
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

import za.ac.cput.domain.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer, String>{

    @Override
    Customer create(Customer customer);

    @Override
    Customer read(String s);

    @Override
    Customer update(Customer customer);

    @Override
    boolean delete(String s);

    List<Customer> getAll();

}
