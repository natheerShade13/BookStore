package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

/*

Author: Chadwin Kyle Fritz 218068360 15/03/2024

 */

public class Payment {
    private final String paymentID;
    private final double amount;
    private final Date paymentDate;
    private final String paymentMethod;

    private Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.amount = builder.amount;
        this.paymentDate = builder.paymentDate;
        this.paymentMethod = builder.paymentMethod;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.amount, amount) == 0 &&
                Objects.equals(paymentID, payment.paymentID) &&
                Objects.equals(paymentDate, payment.paymentDate) &&
                Objects.equals(paymentMethod, payment.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID, amount, paymentDate, paymentMethod);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public static class Builder {
        private String paymentID;
        private double amount;
        private Date paymentDate;
        private String paymentMethod;

        public Builder paymentID(String paymentID) {
            this.paymentID = paymentID;
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

    public Payment copy() {
        return new Builder()
                .paymentID(paymentID)
                .amount(amount)
                .paymentDate(paymentDate)
                .paymentMethod(paymentMethod)
                .build();
    }
}
