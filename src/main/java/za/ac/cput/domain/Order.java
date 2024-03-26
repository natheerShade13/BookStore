package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

/*Order.java
Author: Motlalepula Mbali Kgatlhane (221684212)
Date: 18 March 2024
https://github.com/Mbalsss/BookStore+
 */

public class Order {
    private   String orderID;
    private Date orderDate;
    private  double totalAmount;
    private  String status;



    public Order(Builder builder) {
        this.orderID = builder.orderID;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
        this.status = builder.status;
    }

    //Getters
    public String getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(totalAmount, order.totalAmount) == 0 && Objects.equals(orderID, order.orderID) && Objects.equals(orderDate, order.orderDate) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, orderDate, totalAmount, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder{
        private  String orderID;
        private Date orderDate;
        private double totalAmount;
        private String status;

        public Builder setOrderID(String orderID) {
            this.orderID = orderID;
            return this;
        }
        public Builder setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

       public Builder setTotalAmount(double totalAmount){
           this.totalAmount = totalAmount;
           return this;
       }


        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public Builder copy(Order order){
            this.orderID = order.orderID;
            this.orderDate = order.orderDate;
            this.totalAmount = order.totalAmount;
            this.status = order.status;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
