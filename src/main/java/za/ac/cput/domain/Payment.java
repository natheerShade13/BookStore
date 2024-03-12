package za.ac.cput.domain;

import java.util.Date;

public class Payment {
    private final String paymentID;
    private final String orderID;
    private final double amount;
    private final Date paymentDate;
    private final String paymentMethod;

    private Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.orderID = builder.orderID;
        this.amount = builder.amount;
        this.paymentDate = builder.paymentDate;
        this.paymentMethod = builder.paymentMethod;
    }

    // Getters
    public String getPaymentID() { return paymentID; }
    public String getOrderID() { return orderID; }
    public double getAmount() { return amount; }
    public Date getPaymentDate() { return paymentDate; }
    public String getPaymentMethod() { return paymentMethod; }

    // Builder Pattern
    public static class Builder {
        private String paymentID;
        private String orderID;
        private double amount;
        private Date paymentDate;
        private String paymentMethod;

        public Builder paymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder orderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder paymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
