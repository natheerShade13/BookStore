package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

/*
CustomerFactoryTest.java
Customer factory test class
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

class CustomerFactoryTest {

    @Test
    void TestBuildCustomer() {
        Customer c= CustomerFactory.buildCustomer("3456","keitu",
                "dimpe","kafhm@gmail.com","143 lowry street",
                "+27 67 789 9875");
        assertNotNull(c);
        System.out.println(c.toString());

    }
    @Test
    void testBuildCustomerFail(){
        Customer c2= CustomerFactory.buildCustomer("","Leago",
                "Maphothoma","KarinLeaMH@gmail.com","11829 Tima Street",
                "+27 84 995 9282");
        assertNotNull(c2);
        System.out.println(c2);

    }

}