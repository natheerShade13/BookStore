package za.ac.cput.domain;

import java.util.Objects;

/*
Customer.java
Customer model class
Author: Fereshteh Keitumetse Dimpe 221806229
https://github.com/Keitudimps/BookStore
Date: 24 March 2024
 */

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cellNumber;

    public Customer(Builder builder) {
        this.customerID = builder. customerID;
        this.firstName = builder. firstName;
        this.lastName =  builder.lastName;
        this.email =  builder.email;
        this.address = builder. address;
        this.cellNumber =  builder.cellNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(address, customer.address) && Objects.equals(cellNumber, customer.cellNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, firstName, lastName, email, address, cellNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                '}';
    }
    public static class Builder{

        private String customerID;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String cellNumber;

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }
        public Builder copy (Customer customer){
            this.customerID=customer.customerID;
            this.firstName=customer.firstName;
            this.lastName=customer.lastName;
            this.email=customer.email;
            this.address=customer.address;
            this.cellNumber=customer.cellNumber;
            return this;
        }
        public  Customer build(){
            return new Customer(this);
        }
    }
}
