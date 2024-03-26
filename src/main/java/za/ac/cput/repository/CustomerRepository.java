package za.ac.cput.repository;


import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.List;

/*
CustomerRepository.java
Customer repository class
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

public class CustomerRepository implements ICustomerRepository {
    private static ICustomerRepository repository = null;
    private List<Customer> customerList;

    private CustomerRepository() {
        customerList = new ArrayList<>();
    }

    public static ICustomerRepository getRepository() {
        if (repository == null) {
            repository = new CustomerRepository();
        }
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
        if (customerList.add(customer)) {
            return customer;
        }
        return null;
    }

    @Override
    public Customer read(String id) {
        for (Customer c : customerList) {
            if (c.getCustomerID().equals(id))
                return c;
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        String id = customer.getCustomerID();
        if (read(id) != null) {
            if (delete(id)) {
                if (customerList.add(customer)) {
                    return customer;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Customer customer = read(id);
        if (customer != null) {
            return customerList.remove(customer);
        }
        return false;
    }

    public List<Customer> getAll() {
        return customerList;
    }
}
