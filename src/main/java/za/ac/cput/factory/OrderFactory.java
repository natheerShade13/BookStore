package za.ac.cput.factory;
/*OrderFactory.java
Author: Motlalepula Mbali Kgatlhane
221684212
Date: 18 March 2024
 */

import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.util.Date;

public class OrderFactory {
    public static Order createOrder(String orderID, Date orderDate, double totalAmount, String status){
        if(Helper.isNullOrEmpty(orderID) || orderDate == null || Helper.isNegative(totalAmount) ||Helper.isNullOrEmpty(status)){
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
        if (orderDate == null || Helper.isNegative(totalAmount) || Helper.isNullOrEmpty(status)) {
            return null;
        }
        return new Order.Builder()
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .build();
    }

    private static String generateOrderID(){
        return Helper.generateID();
    }
}
