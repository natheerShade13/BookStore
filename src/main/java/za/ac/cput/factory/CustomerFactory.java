package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer buildCustomer(String customerID, String firstName, String lastName, String email, String address, String cellNumber) {
        if (Helper.isNullOrEmpty(customerID) || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(address) || Helper.isNullOrEmpty(cellNumber))
            return null;

        return new Customer.Builder()
                .setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setCellNumber(cellNumber)
                .build();
    }
    public static Customer buildCustomer(String firstName, String lastName, String email, String address, String cellNumber) {
        if ( Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(address) || Helper.isNullOrEmpty(cellNumber))
            return null;
        String customerId= Helper.generateID();
        return new Customer.Builder().setCustomerID(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setCellNumber(cellNumber)
                .build();
    }
}
