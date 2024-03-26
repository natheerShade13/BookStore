package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

/*
CustomerRepositoryTest.java
Customer repository test class
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerRepositoryTest {
    private static ICustomerRepository repository=CustomerRepository.getRepository();
    private Customer customer= CustomerFactory.buildCustomer("4567","james",
            "williams","JMWilliam@icloud.com","10 Dorset street","+27 63 356 3224");
    private Customer customer2=CustomerFactory.buildCustomer("9876","Leago",
                "Maphothoma","KarinLeaMH@gmail.com","11829 Tima Street",
                        "+27 84 995 9282");
    @Test
    @Order(1)
    void create() {
        Customer add = repository.create(customer);
        assertNotNull(add);
        System.out.println(add);
        Customer add2 = repository.create(customer2);
        assertNotNull(add2);
        System.out.println(add2);
    }

    @Test
    @Order(2)
    void read() {
        String customerID =customer.getCustomerID();
        Customer read = repository.read(customerID);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Customer newCustomer = new  Customer.Builder().copy( customer).setFirstName("James Mathew").build();
        Customer update = repository.update(newCustomer);
        assertNotNull(update);
        System.out.println(update);
    }
    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(customer.getCustomerID()));
        System.out.println("Successfully deleted");
    }


}
