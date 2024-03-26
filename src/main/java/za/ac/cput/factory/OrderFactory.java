package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.util.Date;

/*OrderFactory.java
Author: Motlalepula Mbali Kgatlhane (221684212)
Date: 18 March 2024
https://github.com/Mbalsss/BookStore+
 */

public class OrderFactory {
    public static Order createOrder(String orderID, Date orderDate, double totalAmount, String status){
        if(Helper.isNullOrEmpty(orderID) || Helper.isNull(orderDate) || Helper.isNegative(totalAmount) ||Helper.isNullOrEmpty(status)){
            return null;
        }
        return new Order.Builder()
                .setOrderID(orderID)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .build();
    }
    public static Order createOrder(Date orderDate, double totalAmount, String status) {
        if (Helper.isNull(orderDate) || Helper.isNegative(totalAmount) || Helper.isNullOrEmpty(status)) {
            return null;
        }

        String orderNum = Helper.generateID();

        return new Order.Builder()
                .setOrderID(orderNum)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .build();
    }
}
